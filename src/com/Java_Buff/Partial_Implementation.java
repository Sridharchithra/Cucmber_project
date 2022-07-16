package com.Java_Buff;

public class Partial_Implementation extends Partial_Abstraction {

	
	public void method3() {
		System.out.println("this is abstract method3");
		
		
	}


	public void method4() {
		System.out.println("this is abstract method4");
		
	}
	public static void main(String[] args) {
		Partial_Implementation o=new Partial_Implementation();
		o.method1();
		o.methiod2();
		o.method3();
		o.method4();
		
	}


		

}
