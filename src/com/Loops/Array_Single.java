package com.Loops;

public class Array_Single {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 19;
		a[2] = 17;
		a[3] = 16;
		a[4] = 56;

		System.out.println(a[4]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		String b[] = { "java", "sri", "boy", "girl", "mom" };
		int c = b.length;
		System.out.println("length:" + c);
		System.out.println(b[4]);
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

	}

}