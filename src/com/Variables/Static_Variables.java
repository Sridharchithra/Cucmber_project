package com.Variables;

public class Static_Variables {
	static int a = 30;
	static float b = 1.7864f;
	static boolean c = 6 > 7;

	public static void m1() {
		int a = 10;

		System.out.println(a);
	}

	public static void m2() {
		int a = 20;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Static_Variables.a=40;  //we can change the int value
		Static_Variables.a=1000;
		m1();
		m2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
