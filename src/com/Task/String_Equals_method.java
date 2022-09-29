package com.Task;

public class String_Equals_method {

	public static void main(String[] args) {
	
		String s1 = "welcome";
		String s2 = "welcome";
		if(s1==s2) {
			System.out.println("first "+true);
		}
		StringBuilder sb1=new StringBuilder("welcome");
		StringBuilder sb2=new StringBuilder("welcome");
		if(sb1==sb2) {
		
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		String str=new String("welcome");
		if(s1.equals(str)) {
			System.out.println("third"+true);
		}
		if(s1==str) {
			System.out.println(true);
		}

     
	}

}
