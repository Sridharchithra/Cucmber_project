package com.Java_Buff;

public class Type_Casting {
public static void main(String[] args) {
	byte a=12;
	System.out.println(a);
	short b=1234;
	System.out.println(b);
	int c=123456789;
	System.out.println(c);
	long d=123445678888876l;
	System.out.println(d);
	//widening
	int f=a;
	System.out.println(f);
	long g=b;
	System.out.println(g);
	//narrowing 
	byte h=(byte)c;
	System.out.println(h);
	int k=(int)d;
	System.out.println(k);

}
}