package com.Programs;

public class Swap {
public static void main(String[] args) {
//	int a=10;
//	int b=20;
//	int c;
//	
//	c=a;
//	a=b;
//	b=c;
//	System.out.println(a+" "+b);
//	
	int a=10,b=20;
	b=a+b-(a=b);
	System.out.println("after swap:"+a+" "+b);
	
	for (int i = 1; i <=5; i++) {
	for (int j = 4; j>=i; j--) {
		System.out.print(" ");
	}
	for (int k= 1; k<=i; k++) {
		System.out.print("*");
	}
	
	for (int l =2; l<=i; l++) {
	System.out.print("$");	
	}
	System.out.println(" ");
	}
	
	
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(" ");
		}
		
		for (int k =4; k>=i; k--) {
			System.out.print("*");
		}
		for (int l = 3; l >=i; l--) {
			System.out.print("$");
		}
		System.out.println("");
	}
	
}
}
