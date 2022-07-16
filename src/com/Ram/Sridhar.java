package com.Ram;

public class Sridhar implements Interfaces3 {

	@Override
	public void method2() {
		System.out.println("sri");
		
	}

	@Override
	public void method() {
		System.out.println("nila");
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("mom");
	}
	
	public static void main(String[] args) {
		Sridhar obj=new Sridhar();
		obj.method();
		obj.method2();
		obj.method3();
	
	}
}
