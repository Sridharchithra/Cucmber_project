package com.Exceptions;

public class MyException extends Exception {



	public MyException() {
		System.out.println("can not div");
	}

	public MyException(String str) {
		System.out.println(str);
	}
	

}
