package com.Programs;

public class StringObjects {

	public static void main(String[] args) {
		String a=new String("dog");
		String b="dog";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		  if(a.equals(b)) {
			  System.out.println("true");
		  }
		  else {
			  System.out.println("false");
		  }

		  
		  
	 int fact=1	 ;
	 int n=5;
	 for (int i = 1; i <=n; i++) {
		 fact= fact*i;
		 
	}
		 System.out.println(fact); 
		  
		  
		  
		  
		  
		  
		  
	}

}
