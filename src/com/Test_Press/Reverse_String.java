package com.Test_Press;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string that you want to reverse: ");
		String s = sc.nextLine();
		String reverse = "";

		for (int j = s.length() - 1; j >= 0; j--) {
			reverse += s.charAt(j);
		}

		System.out.print("The reverse of the given string : " + reverse);

	}

}
