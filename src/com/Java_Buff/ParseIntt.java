package com.Java_Buff;

public class ParseIntt {

	public static void main(String[] args) {
    int a=2;
    int b=2;
    
    System.out.println(a+b);
    String c="2";//sri  number format exception
    System.out.println(a+c);
    int d= Integer.parseInt(c);
    System.out.println(d);
    System.out.println(a+d);
    
	}

}
