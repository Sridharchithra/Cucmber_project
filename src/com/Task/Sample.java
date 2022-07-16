package com.Task;

public class Sample {
	
	
	public void divide() {
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.exit(0);
		}finally {
		System.out.println("arithmetic");
		
	}}
	public static void main(String[] args) {
		Sample o=new Sample();
		o.divide();
	}

}
