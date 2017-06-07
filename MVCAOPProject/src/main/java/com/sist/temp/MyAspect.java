package com.sist.temp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Aspect
@Component
@Repository
public class MyAspect {
	@Before("execution(* com.sist.dao.MyDatabase.o*(..))")
	public void getConnection(){
		System.out.println("오라클 연결");
	}
	@After("execution(* com.sist.dao.MyDatabase.o*(..))")
	public void disConnection(){
		System.out.println("오라클 해제");
	}
}
