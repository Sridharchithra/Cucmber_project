package com.Variables;

public class Class_Variables {
	int a=24;
	float b;//can be intialized or declared
	boolean c;
	 public void m1() { int a=34;
		 
		 System.out.println(a);}
	 public void m2() {
		 int a=54;
		 System.out.println(a);
		 System.out.println(b);
	 }
	public static void main(String[] args) {
		 Class_Variables q=new Class_Variables();
		 q.m1();
		 q.m2();
		 System.out.println(q.a);
		 System.out.println(q.b);
		 System.out.println(q.c);
	}
}