package com.Java_Buff;

import java.util.HashSet;
import java.util.Set;

public class Set_Iterate {

	public static void main(String[] args) {

		Set<Object> s=new  HashSet<Object>();
		s.add("java");
		s.add("python");
		s.add("A");
		s.add("ruby");
		s.add(123);
		System.out.println(s);
		
		//for each
		for (Object o : s) {
			System.out.println(o);
		}
		
	}

}
