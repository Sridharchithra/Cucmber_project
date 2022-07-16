package com.Java_Buff;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;




public class Map_Iteration {

	public static void main(String[] args) {
		Map<Object,Object> m=new HashMap<Object,Object>();

	m.put('A', "appple")	;
	m.put(1,'B' );
	m.put(2,0.123f);
	System.out.println(m);
	// for (Object o: m.keySet()) {
	//	System.out.println(o);
//}

	for (Object string : m.values()) {
		System.out.println(string);
	}	
	for (Entry<Object,Object>  o : m.entrySet()) {
		System.out.println(o);
	}	
		
	}

}
