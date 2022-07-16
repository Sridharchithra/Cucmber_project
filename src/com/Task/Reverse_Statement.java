package com.Task;

public class Reverse_Statement {

	public static void main(String[] args) {
		String s="hi good morning";
		String[] split = s.split(" ");
		String rs="";
		
		for (int i = 0; i < split.length; i++) {
		
			rs=" "+split[i]+rs;
			
		}
		System.out.println("reverse string:"+rs);
		
	}

}
