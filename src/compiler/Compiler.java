package compiler;

import compiler.Exceptions.*;
import compiler.Phases.Analysis;
import compiler.Phases.Frontend;
import compiler.Phases.PrettyPrint;
import compiler.IR.*;
import compiler.IR.support.Serializer;

public class Compiler {

	private static String filename;
	private static String outputfilename;
		
	private static boolean debug;
	
	private static String[] arguments={ "" };
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Compiler c = new Compiler(args);
			IR ir = c.generateIR();
			ir = c.analyseIR(ir);
		} 
		catch (CompilerError e) {
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}

	public Compiler(String[] args) throws CompilerError {
		//
		// here we should inspect the arguments
		//

		if (args.length==0) {
			help();
		}

		filename = null;
		debug = false;

		for (int i=0;i<args.length;i++) {
			String arg = args[i];
			if (arg.charAt(0)!='-') {

				//
				// store the filename
				//

				filename = args[i];
				outputfilename = filename.substring(0, filename.lastIndexOf('.'))+"_parsed.xml";
			} else {
				if (arg.equals("-v")) {
					debug=true;
					continue;
				}
				if (arg.equals("-o")) {

					if (i==args.length) {
						throw new CompilerError("argument for -o is missing");
					}
					
					outputfilename = args[i++];
					continue;
				}
				if (arg.equals("--")) {
					// from here on the arguments should go to the program
					
					Compiler.arguments = new String[(args.length - i - 1)];
					for (int ai = i+1; ai<args.length; ai++) {
						Compiler.arguments[ai-i-1] = args[ai];
					}
					break;
				}
			}
		}
		
		if (filename == null) {
			throw new CompilerError("No filename specified");
		}

	}

	public IR generateIR() throws CompilerError
	{
		IR ir;
		
		System.out.print("Parsing... ");

		try {
			ir = Frontend.parse(filename);
		} catch (ParseError e) {
			throw new CompilerError("Parse Error: "+e.getMessage());
		}
		
		System.out.println("done.");

		try {
			new PrettyPrint().visitProgram(ir.getProgram());
		} catch (VisitorException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return ir;

	}

	public IR analyseIR(IR ir) throws CompilerError {
		System.out.println("Analysing... ");

		try {
			Analysis.analyse(ir);
		} catch (TypeCheckerException e) {
			throw new CompilerError("TypeCheckError "+e.getMessage());
		}
	
		System.out.println("done.");
		
		try {
			new PrettyPrint().visitProgram(ir.getProgram());
		} catch (VisitorException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		return ir;
	}

private void help() {
		
		System.err.println("\n");
		System.err.println("MiniJava compiler\n");
		System.err.println("====================\n\n");
		System.err.println("Invoke with \"java -jar path/to/jar/file \" or via GUI.");
		System.err.println("arguments: [-v] filename\n\n");
		System.err.println("  -v            be verbose\n");
		System.err.println("  filename      source filename\n");
		System.exit(-1);
	}

	public static String getFilename() {
		return filename;
	}

	public static String getOutputfilename() {
		return outputfilename;
	}

	public static String[] getArguments() {
		return arguments;
	}

	public static boolean isDebug() {
		return debug;
	}
	
}
