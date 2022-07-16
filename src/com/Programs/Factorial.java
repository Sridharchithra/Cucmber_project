package com.Programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Factorial number :");
	Scanner s=new Scanner(System.in);
	   int n = s.nextInt();
	   int fact=1;
	   for(int i=1;i<=n;i++) {
	   
	   fact*=i;
	   
	   
	}
	   System.out.println(fact);

}}
