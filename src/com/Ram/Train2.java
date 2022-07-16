package com.Ram;

public class Train2 extends Train {
	public void method1() {
		String a = "grand train";
		int b = 3;
		boolean d = true;

		System.out.println();
		System.out.println("current situation: " + a);
		System.out.println("next train :" + b + "minutes");
		System.out.println("is uptown :" + d);

	}

	public static void main(String[] args) {
		Train2 o = new Train2();

		 o.main();
		o.method1();
	}

}
