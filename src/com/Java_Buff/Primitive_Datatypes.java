package com.Java_Buff;

public class Primitive_Datatypes {
	public void numeric() {
		byte a = 15;
		short b = 1234;
		int c = 80845936;
		long d = 98765456788l;
		float f = 1.4356f;
		double g = 3.5677890436d;
		System.out.println("byte: "+a);
		System.out.println("short: "+b);
		System.out.println("int: "+c);
		System.out.println("long: "+ d);
		System.out.println("float: "+ f);
		System.out.println("double: "+ g);
	}

	public void nonNumeric() {
		char h = 's';
		boolean j = 5 < 10;

		System.out.print("char: "+h);
		System.out.println("boolean: "+ j);

	}

	public static void main(String[] args) {
		Primitive_Datatypes obj = new Primitive_Datatypes();
		obj.numeric();
		obj.nonNumeric();

	}

}
