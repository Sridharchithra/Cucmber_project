package com.Exceptions;

public class User_Defined_Exception {
	
	private void user() throws Exception {
		try {
			System.out.println(8/0);
		}catch(Exception e) {
			throw new MyException();
		}
		System.out.println("arith completed");

	}
	
	

	public static void main(String[] args) throws Exception {
	
		User_Defined_Exception o=new User_Defined_Exception();
		o.user();
	}

}
