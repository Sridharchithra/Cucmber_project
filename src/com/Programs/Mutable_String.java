package com.Programs;

public class Mutable_String {

	public static void main(String[] args) {
        String s="sri nila vezhil";
         String[] allwords = s.split(" ");
         String capt="";
         for (String str : allwords) {
			    String s1=str.substring(0,1);
			    String s2=str.substring(1);
		
			    capt+=s1.toUpperCase()+s2+" ";
	
        // System.out.println(capt);
         }
		

	System.out.println(capt);
	
	
		
		
	}
	

}
