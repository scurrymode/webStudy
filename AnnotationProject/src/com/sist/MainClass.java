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
		System.out.println("�Է�:");//a, b, c
		String data = scan.next();
		
		//�ڹ� ������ �����ϱ� �� �� �ִ� ���
//		A aa = new A();
//		if(data.equals("a")){
//			aa.a();
//		}else if(data.equals("b")){
//			aa.b();
//		}else if(data.equals("c")){
//			aa.c();
//		}
		
		//����ڰ� ������ �Ҷ����� ����ڰ� �޼��� �̸��� �ľ� �����ϴ�.
		Class clsName=Class.forName("com.sist.A"); //Ŭ���� �̸��� �˸� �޸� �Ҵ� ����
		Object obj = clsName.newInstance();
		Method[] methods= clsName.getDeclaredMethods();
		for(Method m:methods){
//			String name=m.getName();
//			if(data.equals(name)){
//				m.invoke(obj, null); //�޼��� �̸� ���� ���డ��
//			}
			
			RequestMapping rm=m.getAnnotation(RequestMapping.class);
			if(data.equals(rm.value()))
				m.invoke(obj, null);
		}
		
		
		

	}

}
