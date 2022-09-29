package com.Task;

public class Missing_Array {

	public static void main(String[] args) {
     int a[] = { 1, 2, 3, 5 };
		// 1+2+3+5=11
		// 1+2+3+4+5=15
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 += a[i];

		}
		System.out.println("sum of array:" + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 5; i++) {
			sum2 += i;

		}
		System.out.println("sum of range:" + sum2);

		sum2 -= sum1;
		System.out.println("missing array:" + sum2);
		
	}
}
