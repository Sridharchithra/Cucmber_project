package com.Exceptions;

public class Inner_Try {

	public static void main(String[] args) {
		try {
			System.out.println(9/0);
		
			try {
				int a[] = new int[5];
				a[5] = 9;

			} catch (ArrayIndexOutOfBoundsException b) {
             System.out.println("array");
			}finally {
				System.out.println("final");
			}

			try {
				System.out.println(10/0);
			} catch (ArithmeticException e) {
				System.out.println("arith");
			}
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("sri");	
		
		}catch(Throwable e) {
			System.out.println("throw");
		}

	}

}
