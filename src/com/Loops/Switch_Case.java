package com.Loops;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		//System.out.println("enter ur input");
		//while(true)
		//for (int i = 0; i < 4; i++) 
	while(true)	{
			
		
			System.out.println("enter ur input");

			Scanner s = new Scanner(System.in);
			String a = s.next();
			switch (a) {
			case "sri" :
				System.out.println("fan");
				break;
				default:
				System.out.println("noth");
				break;
			case "ram" :
				System.out.println("light");
				break;
			case "dr":
				System.out.println("ac");
				break;
			}
		}
	}
}
