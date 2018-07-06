package com.sun.learn.domain;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.StringUtils;

public class AnnotationChecker {

	private final static ConcurrentHashMap<String, Field[]> fieldsMap = new ConcurrentHashMap<>();

	public AnnotationChecker() {
		super();
	}

	public static void checkParam(Object object) {
		Class<? extends Object> clazz = object.getClass();
		Field[] fields = null;
		if (fieldsMap.containsKey(clazz.getName())) {
			fields = fieldsMap.get(clazz.getName());
		}
		// getFields:获得某个类的所有的公共（public）的字段，包括父类;getDeclaredFields获得某个类的所有申明的字段，即包括public、private和proteced，但是不包括父类的申明字段
		else {
			fields = clazz.getDeclaredFields();
			fieldsMap.put(clazz.getName(), fields);
		}
		for (Field field : fields) {
			synchronized (field) {
				field.setAccessible(true);
				check(field, object);
				field.setAccessible(false);
			}
		}

	}

	private static void check(Field field, Object object) throws PostingException {
		String description;
		Object value = null;
		TestAnnotation ca = field.getAnnotation(TestAnnotation.class);
		try {
			value = field.get(object);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		if (ca == null)
			return;
		// 如果没有标注description默认展示字段名称
		description = ca.description().equals("") ? field.getName() : ca.description();
		if (!ca.isNull()) {
			if (value == null || StringUtils.isEmpty(value.toString().trim())) {
				throw new PostingException(CommonPostCode.PARAM_LENGTH.getErrorCode(),
						description + " " + CommonPostCode.PARAM_NULL.getErrorMesage());
			}
		}
		if (value.toString().length() > ca.maxLength()) {
			throw new PostingException(CommonPostCode.PARAM_LENGTH.getErrorCode(),
					description + " " + CommonPostCode.PARAM_LENGTH.getErrorCode());
		}
	}
}
