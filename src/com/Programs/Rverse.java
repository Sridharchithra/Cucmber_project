package com.Programs;

public class Rverse {

	public static void main(String[] args) {
 int n=4554;
 int a=n,j=0,i;
     while(a>0) {
    	 i=a%10;       //3     //4  
    	 j=(j*10)+i;     //3    34
    	 a=a/10;         //14    1 
     }
     System.out.println(j);
     if(j==n) {
    	 System.out.println("palindrome");
     }
	}
	

}
