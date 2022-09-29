package com.Loops;

public class Array_2D {
	public static void main(String[] args) {
		int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
	//	int a[][]=new int [2][2];
		System.out.println(a[2][1]);
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
			
			System.out.print(a[i][j]+" ");}
			System.out.println();
		}
	}

}
