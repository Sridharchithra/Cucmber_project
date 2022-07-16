package com.Programs;

public class ReverseString {

	public static void main(String[] args) {
     String s= "sri nila jk yo";
     System.out.println(s.length());
     for (int j =s.length()-1; j >=0; j--) {
		System.out.print(s.charAt(j));
	}
     
     
     System.out.println();
     String e="sridhar";
		for (int j =e.length()-1; j >=0; j--) {
			System.out.print(e.charAt(j));
			
		}
		

		

     System.out.println();
     
    System.out.println("-----------------------"); 
    String reversesen="";
    String s1[]=s.split(" ");
    for (int i = 0; i < s1.length; i++) {
		System.out.println(s1[i]);
	}
    System.out.println("------------------------------");
     for (String word: s1) {
	 String reverse="";
       for (int i =word.length()-1;i>=0; i--) {
    	  char c=word.charAt(i);
    	  reverse=reverse+c;
    	 
    	   
	}
       reversesen+=reverse+" ";
     }
   System.out.println(reversesen);  
		
		
				String vege[]= {"str","rtr","iyt"};
       for (int j = vege.length-1; j>=0; j--) {
		System.out.print(vege[j]+" ");
	}
      
	}

}
