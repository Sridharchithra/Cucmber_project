package com.Java;

public class Test_Case {
	public static void main(String[] args) {
		String s1="Sololearn";
		String s2="sololearn";
		boolean b=false,b1=true;
		char ch=65;
		if(s1.toLowerCase().equals(s2))
		b=!b;	
		if(s1.charAt(7)==ch)
		b1=false;
		System.out.println(b+" "+b1);
		double i=1.45d;
		int d=(int)i;
		System.out.println(d/2);
		int age=8;
		if((age<=7 && age>10)|| (age !=9&& age!=7)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		int x=10;
		System.out.println(++x);//11
		System.out.println(x++);//11 but increment 12 
		System.out.println(x++);
		
		String data="mydata";
		
		int y=10;
		data +=++y;
		System.out.println(data);//mydata11
		System.out.println(data+=++y);//mydata1112
		
		
	}

}
