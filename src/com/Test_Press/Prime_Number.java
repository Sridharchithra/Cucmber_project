package com.Test_Press;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Check the number prime or not :");
		int n = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime == true) {
			System.out.println(n + " : is prime");
		} else {
			System.out.println(n + " : is not a prime");
		}
	}

}
