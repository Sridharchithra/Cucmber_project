package com.Java_Buff;

import java.util.Scanner;

public class Sccanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Review:");
		String a = s.nextLine();
		System.out.println("your review is: "+a);
		System.out.println("Enter your rating: ");
		int b = s.nextInt();
		System.out.println("your  rating is "+b);
		System.out.println("Hotel name:");
		String c = s.next();
		System.out.println("Hotel name is : "+c);
	}

}
