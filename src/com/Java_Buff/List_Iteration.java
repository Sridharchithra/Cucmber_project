package com.Java_Buff;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iteration {

	public static void main(String[] args) {

		List<Object> l = new ArrayList<Object>();
		l.add(123);
		l.add("python");
		l.add("AWS");
		l.add("c");
		l.add("perl");
		System.out.println(l);
		System.out.println("################for loop#########################");
		// for loop
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("***********for each****************************");
		// for each
		for (Object o : l) {
			System.out.println(o);

		}
		System.out.println("*************list iterator**************************");
		// list iterator
		ListIterator<Object> a = l.listIterator();
	//	 boolean b = a.hasNext();//returns true if the iteration has more elements
	//	System.out.println("hasnext : "+b);
	//	Object c = a.next();
	// System.out.println("next: "+c);
while(a.hasNext()) {
	System.out.println(a.next());
}
		
		
		
		
	}

}
