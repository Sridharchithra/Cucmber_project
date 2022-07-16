package com.Programs;

public class Fibo2 {

	public static void main(String[] args) {
     int a=0;
     int b=1; int c=a+b;
     
     for (int i = 0; i <=10; i++) {
    	
    
    	c=a+b;
   	if(c>20) {
    		break;
    	}
    	System.out.println(c);
		a=b;
		b=c;
	}
		char d[]=new char[5];
		d[2]='r';
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
			
			
			}
				
		
		
	}

}
