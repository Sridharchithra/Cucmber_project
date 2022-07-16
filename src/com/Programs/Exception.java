package com.Programs;

public class Exception {

	public static void main(String[] args) throws Throwable{
int c=8/0;	
System.out.println(c);
try
{
System.out.println("1");
int sum = 9 / 0;
System.out.println("2");
}
catch(ArithmeticException e)
{
System.out.println("3");
}
finally
{
System.out.println("5");
}
	
	
	
	
	}	
		
		
		
		
	}

