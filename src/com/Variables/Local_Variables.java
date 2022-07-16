package com.Variables;

public class Local_Variables {
	public void method1() {
		int a = 10;
		 a=30; a=40;
		System.out.println(a);
	}

	public void method2() {
		int a = 80;
		System.out.println(a);

	}

	public void method3() {
		int a = 67;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Local_Variables q=new Local_Variables();
		q.method1();
		q.method2();
		q.method3();
		
	}
}
