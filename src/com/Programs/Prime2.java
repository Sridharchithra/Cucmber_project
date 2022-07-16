package com.Programs;

public class Prime2 {

	public static void main(String[] args) {
int c=0;
	for (int n = 1; n <=500; n++) {
		
	boolean flag=true;
	
	for (int i = 2; i<n;i++ ) {
		
		if(n%i==0) {
			flag=false;
		}}
		if(flag==true) {
			System.out.println(n+":is a prime number ");
			c++;
		}
		
		else {
			System.out.println(n+":is  not a prime number ");
		}
	}
		
		System.out.println(c);
		
		
		System.out.println(3<4);
		
		
		
	}

}
