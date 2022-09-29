package com.Exceptions;

public class Sample {
	
	
	public void divide() {
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e+"sri");
	
		}
		
		System.out.println("arithmetic");
		
	
	}
	public static void main(String[] args) {
		Sample o=new Sample();
		o.divide();
	}

}
