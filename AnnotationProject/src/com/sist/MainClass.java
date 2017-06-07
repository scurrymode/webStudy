package com.sist;
import java.lang.reflect.Method;
import java.util.*;

class A{
	@RequestMapping("a.do")
	public void aqeasdfefwfdgf(){
		System.out.println("a() call...");
	}
	@RequestMapping("b.do")
	public void qwfecefb(){
		System.out.println("b() call...");
	}
	@RequestMapping("c.do")
	public void wcefvfec(){
		System.out.println("c() call...");
	}	
}

public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력:");//a, b, c
		String data = scan.next();
		
		//자바 파일이 있으니깐 할 수 있는 방식
//		A aa = new A();
//		if(data.equals("a")){
//			aa.a();
//		}else if(data.equals("b")){
//			aa.b();
//		}else if(data.equals("c")){
//			aa.c();
//		}
		
		//사용자가 쓰려고 할때마다 사용자가 메서드 이름을 쳐야 가능하다.
		Class clsName=Class.forName("com.sist.A"); //클래스 이름만 알면 메모리 할당 가능
		Object obj = clsName.newInstance();
		Method[] methods= clsName.getDeclaredMethods();
		for(Method m:methods){
//			String name=m.getName();
//			if(data.equals(name)){
//				m.invoke(obj, null); //메서드 이름 몰라도 실행가능
//			}
			
			RequestMapping rm=m.getAnnotation(RequestMapping.class);
			if(data.equals(rm.value()))
				m.invoke(obj, null);
		}
		
		
		

	}

}
