package com.sist;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 기억 ==> CLASS, SOURCE, RUNTIME
// 대상 ==> 구분자(클래스(type), 메서드(method), 멤버변수(filed), 생성자(constructor), 파라미터(parameter-매개변수)

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// @RequestMaaping("a.do")라고 쓰면 바로 밑에 있는걸 호출 할 수 있다.
public @interface RequestMapping {

	public String value();
}
