package com.Variables;

public class Exception_Handling {

	public static void main(String[] args) {
		int a = 40;
		int b = 0;
		try {
			System.out.println(a/b);
		}catch(ClassCastException c) {
			System.out.println("exception occured");
		}
		catch(ArithmeticException  d) {
			System.out.println("arithmetic sri");
		}
		catch(Exception e) {
			System.out.println("exception ");
		}
		
		
		
		
		finally {
			System.out.println("handled");
		}
	}

}
