package com.Programs;

public class For_loops {

	public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {
			for (int j = 3; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

		
	 String sr="welcome to the world";
	 String re="";
	 for (int i =sr.length()-1; i>=0; i--) {
		char c=sr.charAt(i);
		re=re+c;
	}
		System.out.println(re);
		
		
		
	}
	

}
