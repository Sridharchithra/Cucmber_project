package com.Task;

public class Repeat_Char {

	public static void main(String[] args) {
         String s="sridhar";
         int totalLength = s.length();
        System.out.println(totalLength);
        int charlength = s.replace("r", "").length();
        System.out.println(charlength);
        System.out.println(s.replace("r", ""));
         int count=totalLength-charlength;
        
        System.out.println("occurence:"+count);
	}

}
