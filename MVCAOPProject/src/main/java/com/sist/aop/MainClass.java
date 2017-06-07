package com.sist.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.MyDatabase;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
		MyDatabase dao = (MyDatabase)app.getBean("md"); //�̰� �޸𸮿� �ö��ִ°� �ҷ����̴°�~!
		dao.oinsert();
		dao.oupdate();
		dao.oselect();
		dao.print();

	}

}
