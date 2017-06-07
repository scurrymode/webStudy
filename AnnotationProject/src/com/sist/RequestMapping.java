package com.sist;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// ��� ==> CLASS, SOURCE, RUNTIME
// ��� ==> ������(Ŭ����(type), �޼���(method), �������(filed), ������(constructor), �Ķ����(parameter-�Ű�����)

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// @RequestMaaping("a.do")��� ���� �ٷ� �ؿ� �ִ°� ȣ�� �� �� �ִ�.
public @interface RequestMapping {

	public String value();
}
