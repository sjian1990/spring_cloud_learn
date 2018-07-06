package com.sun.learn.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author admin
 *
 */

@Target(value = { ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
	/**
	 * 是否为空
	 * 
	 * @return
	 */
	boolean isNull() default false;

	/**
	 * 最大长度
	 * 
	 * @return
	 */
	int maxLength() default 8;

	/**
	 * 字段描述
	 * 
	 * @return
	 */
	String description() default "";

}
