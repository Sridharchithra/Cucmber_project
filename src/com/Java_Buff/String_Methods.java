package com.Java_Buff;

public class String_Methods {
	public static void main(String[] args) {
		String s = "welcome to java class";
		String s1 = "welcome";
		String s2 = "";
		String s3 = " ";
		String s4 = " welcome to java class ";
		String s5 = "WELCOmE";
		System.out.println("s: "+s);
		// return type boolean
		boolean a = s.startsWith("w");
		System.out.println("starts with: " + a);
		boolean b = s.endsWith("s");
		System.out.println("endswith: " + b);
		boolean c = s1.equals("welcome ");
		System.out.println("equals: " + c);
		boolean d = s1.equalsIgnoreCase(s5);
		System.out.println("equalsignore: " + d);
		boolean e = s1.contains(s);
		System.out.println("contains: " + e);
		boolean f = s2.isEmpty();
		System.out.println("empty: " + f);
		System.out.println("############################");
		// return type string
		String g = s1.toUpperCase();
		System.out.println("uppercase: " + g);
		String h = s5.toLowerCase();
		System.out.println("lowercase: " + h);
		String i = s.replace("to", "for");
		System.out.println("replacee: " + i);
		String j = s.substring(11);
		System.out.println("begin: " + j);
		String k = s.substring(0, 7);
		System.out.println("begin&end: " + k);
		String l = s4.trim();
		System.out.println("trim: " + l);
		String m = s.concat(s5);
		System.out.println("concat: " + m);
		System.out.println("#######################################################");
		// return type string array
		String[] n = s.split(" ");
		for (String obj : n) {
			System.out.println(obj);

		}
		// return type int
		int o = s1.length();
		System.out.println("length:" + o);
		int p = s.hashCode();
		System.out.println("hashcode" + p);
		int q = s.indexOf("o");
		System.out.println("indexof:" + q);
		int r = s.lastIndexOf("o");
		System.out.println("last:" + r);
		int t = s1.compareTo(s5);
		System.out.println("comto:" + t);
		int u = s1.compareToIgnoreCase(s5);
		System.out.println("comtoignore:" + u);
        //return type char
		char v = s.charAt(4);
		System.out.println("char:"+v);
	}

}
