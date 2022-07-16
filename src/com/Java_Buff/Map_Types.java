package com.Java_Buff;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Map_Types {

	public static void main(String[] args) {
		 
		Map<Integer,String> m1=new ConcurrentHashMap <Integer,String>();
		
		//is empty 
		boolean a = m1.isEmpty();
		System.out.println("m1 : "+a);
		//put
		m1.put(1, "java");
		m1.put(2, "python");
		m1.put(3, "AWS");
		m1.put(4, "PERL");
		m1.put(5, "ruby");
		System.out.println("m1 : "+m1);
		//size 
		int  b = m1.size();
		System.out.println("size: "+b);
		//get
		String c = m1.get(4);
		System.out.println("get:"+c);
	
		//keycontains
		boolean d = m1.containsKey(6);
		
		System.out.println("key: "+d);
		//valuecontains
		boolean e = m1.containsValue("AWS");
		System.out.println("value : "+e);
		
		//keyset
	 Set<Integer> f = m1.keySet();
	 System.out.println("keyset: "+f);
	 
	 //values
	 Collection<String> g = m1.values();
	 System.out.println("values"+g);
	 
	 //entryset
	 Set<Entry<Integer, String>> i = m1.entrySet();
	 System.out.println("entryset: "+i);
	 
	 Map <Integer,String> m2=new TreeMap<Integer,String>();
	 m2.put(4, "apple");
	 m2.put(9,"mango");
	 m2.put(7, "orange");
	 m2.put(8, "grape");
	 
	 System.out.println("m2 : "+m2);
	 //put all
	 m1.putAll(m2);
	 System.out.println("put all :"+m1);
	 //clear
	 m2.clear();
	 System.out.println("clear : "+m2);
	 
	 
	 
		
		
		
		
		
		
		
	}

}
