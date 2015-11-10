package compiler.Phases;

import compiler.Exceptions.*;
import compiler.IR.*;

public class Analysis {

	public static void analyse(IR ir) throws TypeCheckerException {
		
		System.out.println("Rewriting 1... (add this arguments)");
		AddThisArgument.rewrite(ir);
		System.out.println("done.");

		try {
			new PrettyPrint().visitProgram(ir.getProgram());
		} catch (VisitorException e1) {
			e1.printStackTrace();
		}

		TypeCheck.check(ir);
		
		System.out.println("Rewriting 2... (add this to selectors)");
		AddThisToSelectors.rewrite(ir);
		System.out.println("done.");

		try {
			new PrettyPrint().visitProgram(ir.getProgram());
		} catch (VisitorException e1) {
			e1.printStackTrace();
		}

		VariableInit.check(ir);
	}
}
