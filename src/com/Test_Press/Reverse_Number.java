package com.Test_Press;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want to reverse:");
		int n = sc.nextInt();

		int a = n, j = 0, i;
		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
		}
		System.out.println("The Reverse of given number:" + j);

	}

}
