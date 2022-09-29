package com.Hacker;

public class Alternateelements {
	public static void main(String[] args) {

		int[] arr = {6,3,4,10,1,8}; 
	//  int[]arr={1,3,4,6,8,10}; //7
	//	int [] arr= {1,2,4,3,6,5};
		int n = arr.length;
        int sum=0;
        
		for (int i =0; i < n; i = i+2) {
		 	System.out.println(arr[i]);
            sum=sum+arr[i];
            
		}
		System.out.println(sum);
	}
}