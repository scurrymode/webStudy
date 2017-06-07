package com.sist.dao;

import org.springframework.stereotype.Repository;

@Repository("md")
public class MyDatabase {
	public void oselect(){
		//오라클 연결
		System.out.println("Select Call...");
		//오라클 연결 해제
	}
	public void oinsert(){
		System.out.println("Insert Call...");
	}
	public void oupdate(){
		System.out.println("Update Call...");
	}
	
	public void print(){
		System.out.println("Print Call...");
	}
}
