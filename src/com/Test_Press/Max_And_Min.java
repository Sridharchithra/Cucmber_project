package com.Test_Press;

import java.util.Scanner;

public class Max_And_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of  the Array: ");
		int n = sc.nextInt();
		int i;
		int arr[] = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("Enter: ");
			arr[i] = sc.nextInt();
		}

		int max = arr[0], min = arr[0];

		for (i = 0; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];

			if (arr[i] < min)
				min = arr[i];

		}
		System.out.println("Maximum Number of the array: " + max);
		System.out.print("Minimum Number of the array: " + min);

	}

}
