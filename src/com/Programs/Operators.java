package com.Programs;

public class Operators {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		//arithmetic operations-return type int
		System.out.println("Arithmetic operators");
		int add=a+b;
		System.out.println("addition: "+add);
		int sub=a-b;
		System.out.println("sub: "+sub);
		int mul=a*b;
		System.out.println("multiply: "+mul);
		int quo=a/b;
		System.out.println("quotient :"+quo);
		int rem=a%b;
		System.out.println("remainder : "+rem);
		System.out.println("************************************");
	//relation operators --return type-boolean
		System.out.println("Relation Operators");
		
		boolean r1=a<b;
		System.out.println("less :"+r1);
		boolean r2=a<=b;
		System.out.println("less equal to: "+r2);
		boolean r3=a>b;
		System.out.println("greater : "+r3);
		boolean r4=a>=b;
		System.out.println("greater equal to: "+r4);
		boolean r5= a==b;
		System.out.println("equals: "+r5);
		boolean r6= a!=b;
		System.out.println("not equal: "+r6);
		System.out.println("****************************************");	
		
	//logical operators-return type boolean
		System.out.println("Logical operators");
		int c=30;
		boolean and =(c>b) && (a>c);
		System.out.println("AND: "+and);
		boolean or=(c>b)||(a>c);
		System.out.println("OR : "+or);
		System.out.println("******************************");
		//conditional statement=ternary operators
		//      condition,keyword, true,keyword,false
		int d=(b>a)? a:b;
			System.out.println("condition : "+d);
	
	
	
	}

}
