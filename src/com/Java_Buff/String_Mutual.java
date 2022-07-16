package com.Java_Buff;

public class String_Mutual {
	public static void main(String[] args) {
		// b new keyword string
		StringBuffer s1 = new StringBuffer("welcome");
		StringBuffer s2 = new StringBuffer("welcome");
      int a = s1.hashCode();
      System.out.println("s1: "+a);
      int b = s2.hashCode();
      System.out.println("s2: "+b );
      
      StringBuffer s3 = s1.append(s2);
      System.out.println(s3);
      int c = s3.hashCode();
      System.out.println("s3: "+c);
      
	}
	

}