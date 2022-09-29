package com.Hacker;

import java.util.Arrays;
import java.util.Collections;

public class Alternative {
	
	public static void main(String[] args) {
		
	
	Integer a[]= {1,2,4,3,6,5};
	
       Arrays.sort(a,Collections.reverseOrder());
       System.out.println(Arrays.toString(a));
       int b=234567 ;
       System.out.println((int)Math.log10(b)+1);
}
}