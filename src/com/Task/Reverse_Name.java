package com.Task;

public class Reverse_Name extends sri {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("sridhar");
		sb.reverse();
		int length = sb.length();
		System.out.println(length);
		System.out.println(sb);
		Reverse_Name o = new Reverse_Name();
		o.sridhar();
	}
}

class sri {
	public void sridhar() {

		String s = "nila";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));

		}
	}
}
