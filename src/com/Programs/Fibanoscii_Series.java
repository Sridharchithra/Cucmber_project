package com.Programs;

public class Fibanoscii_Series {

		public void method1(int n) {
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("*******************");
		for(int i=1;i<=n;i++) {
			a=b;      //a=1 b=1 c=2 print 2
			b=c;       //a=1 b=2  c= 3 print 3
			c=a+b;
			System.out.println(c);
			
		}
	}
		public static void main(String[] args) {
			Fibanoscii_Series d=new Fibanoscii_Series();
			d.method1(10);
		}

}
