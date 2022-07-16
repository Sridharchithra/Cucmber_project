package com.Task;

import java.util.Scanner;

public class Order2 {
	public static void main(String[] args) {
		while(true) {
		System.out.println("enter ur input:");

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
	if(a<=5) {
		System.out.println("free deleivery");
		
}
	else if(a<=10) {
		System.out.println("no free delivery");
	}
	else if(a>10) {
		System.out.println("1 % from your product");
	}
}
}

}