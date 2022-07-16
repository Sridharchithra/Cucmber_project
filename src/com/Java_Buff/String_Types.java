package com.Java_Buff;

public class String_Types {
public static void main(String[] args) {
	//immutable -string literal
	String s1="Welcome";
	String s2="Welcome";
	int a = s1.hashCode();
	System.out.println("s1:"+a);
	int b = s2.hashCode();
	System.out.println("s2: "+b);
	 String s3 = s1.concat(s1);
	 System.out.println("s3: "+s3);
	 int c = s3.hashCode();
	 System.out.println("s3: "+c);
}
}
