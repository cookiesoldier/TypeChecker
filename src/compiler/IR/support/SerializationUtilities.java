package compiler.IR.support;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import compiler.IR.IR;

public class SerializationUtilities {
	
	protected static final String NULLREF = "NULLREF";
	protected static final String IS_ALREADY_SERIALIZED = "IS ALREADY SERIALIZED";
	
	protected static List<Field> getAllFields(Class<?> objectClass) {
		return getAllFields(objectClass, new ArrayList<Field>());
	}
	
	private static List<Field> getAllFields(Class<?> objectClass,
			List<Field> list) {
		Class<?> superclass = objectClass.getSuperclass();
		Field[] fields = objectClass.getDeclaredFields();
		for (Field f : fields) {
			if (!containsField(f, list))
			list.add(f);
		}
		if (superclass != Object.class && superclass != IR.class) {
			getAllFields(objectClass.getSuperclass(), list);
		}
		return list;
	}
	
	protected static boolean isPrimitiveType(Class<?> tagclass) {
		return Boolean.class.isAssignableFrom(tagclass) ||
			   String.class.isAssignableFrom(tagclass) ||
			   Integer.class.isAssignableFrom(tagclass) ||
			   Double.class.isAssignableFrom(tagclass) ||
			   Character.class.isAssignableFrom(tagclass) ||
			   Float.class.isAssignableFrom(tagclass) ||
			   Byte.class.isAssignableFrom(tagclass) ||
			   Long.class.isAssignableFrom(tagclass);
	}
	
	private static boolean containsField(Field field, List<Field> list) {
		for (Field f : list) {
			if (field.getName().equals(f.getName())) {
				return true;
			}
		}
		return false;
	}
}
