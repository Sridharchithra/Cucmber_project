package com.Java_Buff;

public class Constructor_Chain1 {
	public Constructor_Chain1() {
		this(22456);
		System.out.println("parent");
	}

	public Constructor_Chain1(int a) {
		this(2.5678f);
		System.out.println(a);
	}

	public Constructor_Chain1(float b) {
		this("sri");
		System.out.println(b);
	}

	public Constructor_Chain1(String c) {

		System.out.println(c);
	}

	public static void main(String[] args) {
		Constructor_Chain1 b = new Constructor_Chain1(3699799);
	}
}
