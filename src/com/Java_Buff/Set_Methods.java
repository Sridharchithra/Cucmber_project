package com.Java_Buff;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Methods {
	public static void main(String[] args) {
		Set<Object> s= new 	TreeSet <Object>();
		//add    value based
		s.add(12);
		s.add(4);  //give string sri throws class class exception because treeset prints in acending order
		s.add(34);
		s.add(5);
		System.out.println("s : "+s);
		//size
		int a = s.size();
		System.out.println("size :"+a);
		//contains
		boolean b = s.contains(5);
		System.out.println("contains: "+b);
		//is empty
		boolean c = s.isEmpty();
		System.out.println("empty : "+c);
		
		Set<Object> s1= new HashSet <Object>();
		s1.add(6); s1.add(12);
		s1.add(5); s1.add(26);
		//add all
	//	s1.addAll(s);
	//	System.out.println(" add all : "+s1);
		//retain all
		s.retainAll(s1);
		 System.out.println("retain : "+s);
		//remove all
		// s.removeAll(s1);
	// 	System.out.println("remove all:"+s);
	//	s.remove(5);
	//	System.out.println("remove: "+s);
		
		
		
	}

}
