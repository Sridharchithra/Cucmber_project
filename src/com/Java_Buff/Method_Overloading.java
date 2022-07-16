package com.Java_Buff;

public class Method_Overloading {
	public void method1() {
		System.out.println("sri");
		
	}
	public void method1(int a) {
		System.out.println(a);
		}
	public void method1(float b) {
		System.out.println(b);
		
	}
	public void method1(int a, int b) {
		System.out.println(a+b);
		
	}
	public void method1(short a,short b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		Method_Overloading o=new Method_Overloading();
		o.method1();
		o.method1(56789);
		o.method1(2.345678f);
		o.method1(4567, 6784);
		o.method1(2354, 98765);
	}


}
