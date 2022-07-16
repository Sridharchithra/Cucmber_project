package com.Java_Buff;

public class Constructor_Chain2  extends Constructor_Chain1{
	public Constructor_Chain2() {
		this(22456);
		System.out.println("child");
	}

	public Constructor_Chain2(int a) {
		this('c');
		System.out.println(a);
	}

	public Constructor_Chain2(char b) {
		this(69666533l);
		System.out.println(b);
	}

	public Constructor_Chain2(long c) {
       super();
		System.out.println(c);
	}
public static void main(String[] args) {
	Constructor_Chain2 t=new Constructor_Chain2();
}
}
