package com.Exceptions;

public class Sample_Exception {
	
	

	public void divide() {
	
		
		try {
			
			System.out.println(10/0);}
			
		 catch (Exception e) {
			
			System.out.println("sri");
		//System.exit(0);	
			
		}finally {
			System.out.println("final");
		}
		
		
		
	}

	public static void main(String[] args) {
		Sample_Exception o=new Sample_Exception();
		o.divide();
	}

}
