package compiler.IR.support;

import java.io.PrintWriter;
import java.lang.reflect.*;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class Serializer {


	// For writing
	private static Map<Object, Integer> serializedObjectsMap;
	private static int idcounter = 0;
	private static boolean alreadySerialized;

	public void serialize(Object ir, String outputfilename) throws Exception {
		PrintWriter writer = new PrintWriter(outputfilename, "UTF-8");
		StringBuffer sb = new StringBuffer();
		serializedObjectsMap = new IdentityHashMap<Object, Integer>();
		sb.append("<" + ir.getClass().getName() + " id=" + idcounter + ">\n");
		String xmlstring = getXmlString(ir, "    ");
		sb.append(xmlstring);
		sb.append("</" + ir.getClass().getName() + ">");
		writer.print(sb.toString());
		writer.close();
	}

	private static String getXmlString(Object irObject, String indent)
			throws Exception {
		StringBuffer resultbuffer = new StringBuffer();
		Class<?> objectClass = irObject.getClass();
		List<Field> fields = SerializationUtilities.getAllFields(objectClass);
		for (Field f : fields) {
			f.setAccessible(true);
			Object fieldobject = f.get(irObject);
			resultbuffer.append(indent + "<");
			resultbuffer.append(f.getName());
			resultbuffer.append(">\n");
			resultbuffer.append(indent + "    " + "<");
			String classname;
			if (fieldobject != null) { // Write name of contained class if
										// possible
				classname = fieldobject.getClass().getName();
			} else { // If no object is contained, write the name of the
						// class of the field instead.
				classname = f.getType().getName();
			}
			resultbuffer.append(classname);
			alreadySerialized = false;
			String idtext = getIDForObject(fieldobject);
			resultbuffer.append(idtext);
			resultbuffer.append(">\n");
			String xmlstring = alreadySerialized ? indent + "        "
					+ SerializationUtilities.IS_ALREADY_SERIALIZED + "\n" : getXmlStringGeneral(fieldobject,
					indent + "        ");
			resultbuffer.append(xmlstring);
			resultbuffer.append(indent + "    " + "</");
			resultbuffer.append(classname);
			resultbuffer.append(">\n");
			resultbuffer.append(indent + "</");
			resultbuffer.append(f.getName());
			resultbuffer.append(">\n");
		}
		return resultbuffer.toString();
	}

	private static String getIDForObject(Object fieldobject) {
		alreadySerialized = false;
		if (fieldobject != null) {
			int id;
			if (serializedObjectsMap.containsKey(fieldobject)) {
				id = serializedObjectsMap.get(fieldobject);
				alreadySerialized = true;
			} else {
				idcounter++;
				serializedObjectsMap.put(fieldobject, idcounter);
				id = idcounter;
			}
			return " id=" + id;
		}
		return "";
	}
	

	private static String getXmlString(Collection<?> collection, String indent)
			throws Exception {
		StringBuffer resultbuffer = new StringBuffer();
		Object[] objects = collection.toArray();
		for (Object o : objects) {
			resultbuffer.append(indent + "<" + o.getClass().getName());
			resultbuffer.append(getIDForObject(o));
			resultbuffer.append(">\n");
			if (alreadySerialized) {
				resultbuffer.append(indent + "    " + SerializationUtilities.IS_ALREADY_SERIALIZED + "\n");
			} else {
				resultbuffer.append(getXmlStringGeneral(o, indent + "    "));
			}
			resultbuffer.append(indent + "</" + o.getClass().getName() + ">\n");
		}
		return resultbuffer.toString();
	}

	private static String getXmlString(Map<?, ?> map, String indent)
			throws Exception {
		StringBuffer resultbuffer = new StringBuffer();
		Object[] keyset = map.keySet().toArray();
		for (Object key : keyset) {
			resultbuffer.append(indent + "<KeyValuePair>\n");
			resultbuffer.append(indent + "    <key>\n");
			resultbuffer.append(indent + "        <");
			resultbuffer.append(key.getClass().getName());
			resultbuffer.append(getIDForObject(key));
			resultbuffer.append(">\n");
			if (alreadySerialized) {
				resultbuffer.append(indent + "            " + SerializationUtilities.IS_ALREADY_SERIALIZED + "\n");
			} else {
				resultbuffer.append(getXmlStringGeneral(key, indent + "            "));
			}
			resultbuffer.append(indent + "        </"
					+ key.getClass().getName() + ">\n");
			resultbuffer.append(indent + "    </key>\n");
			resultbuffer.append(indent + "    <value>\n");
			Object value = map.get(key);
			resultbuffer.append(indent + "        <");
			resultbuffer.append(value.getClass().getName());
			resultbuffer.append(getIDForObject(value));
			resultbuffer.append(">\n");
			if (alreadySerialized) {
				resultbuffer.append(indent + "            " + SerializationUtilities.IS_ALREADY_SERIALIZED + "\n");
			} else {
				resultbuffer.append(getXmlStringGeneral(value, indent + "            "));
			}
			resultbuffer.append(indent + "        </"
					+ value.getClass().getName() + ">\n");
			resultbuffer.append(indent + "    </value>\n");
			resultbuffer.append(indent + "</KeyValuePair>\n");
		}
		return resultbuffer.toString();
	}

	private static String getXmlStringGeneral(Object object, String indent)
			throws Exception {
		if (object == null) {
			return indent + SerializationUtilities.NULLREF + "\n";
		}
		if (object instanceof Collection) {
			return getXmlString((Collection<?>) object, indent);
		} else if (object instanceof Map) {
			return getXmlString((Map<?, ?>) object, indent);
		} else if (SerializationUtilities.isPrimitiveType(object.getClass()) || object.getClass().isEnum()){
			return indent + object.toString() + "\n";
		} else {
			return getXmlString(object, indent);
		}
	}
}
