package com.Programs;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
        int a=n,i,j=0;
        while(a>0) {
        	i=a%10;
        	j=j+(i*i*i);
        	a=a/10;
        
        }
        if(n==j) {
        System.out.println("armstrong");
	}else {
		System.out.println("not a armstrong");
	}
	
        boolean a1=true;
        System.out.println(!a1);
        
        int q=10;
        double s=10.1d;
        if(s==q) {
        	System.out.println("sri");
        }else {
        	System.out.println("not");
        }
        
        		
	}
}
