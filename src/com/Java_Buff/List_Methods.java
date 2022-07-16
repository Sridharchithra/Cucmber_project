package com.Java_Buff;

import java.util.List;
import java.util.Vector;

public class List_Methods {


	public static void main(String[] args) {
		List <Integer> l=new Vector <Integer>(); 
		//add -value based
	     boolean a = l.add(1);
	     System.out.println("l list created : "+a);
	     l.add(12);
	     l.add(3); l.add(5); l.add(3); l.add(1);
	     l.add(3); 
	     l.add(0);
	     System.out.println(" new list :"+l);
	      //index based -add 
	     l.add(1 ,6);
	       System.out.println("update list :" +l);
	       //size  -value based
	       int b = l.size();
	       System.out.println("size: "+b);
	       //contains -value based
	       boolean c = l.contains(16);
	       System.out.println("contains: "+c);
	       //is empty -value based
	        boolean d = l.isEmpty();
	         System.out.println("empty: "+d);
	         //get -index based
	         Integer e = l.get(2);
	         System.out.println("get :"+e);
	         // set - index based
	         Integer f = l.set(3,13);
	         System.out.println("set: "+f);
	         System.out.println("list after set : "+l);
	         //remove-value based
	         Integer g = l.remove(0);
	         System.out.println("remove: "+l);
	         // index of
	         int i = l.indexOf(3);
	         System.out.println("index: "+i);
	         //last index
	         int j = l.lastIndexOf(3);
	         System.out.println("last index :"+j);
	         List <Integer> l1=new Vector <Integer>();
	         l1.add(6);
	         l1.add(12);
	         l1.add(13);
	         l1.add(5);
	         l1.add(3);
	         l1.add(1);
	         l1.add(0);
	         System.out.println(l);
	         System.out.println(l1);
	         //equals
	         boolean h = l.equals(l1);
	         System.out.println("equals: "+h);
	         //contains all
	        boolean k = l.containsAll(l1);
	        System.out.println("contains all : "+k);
	        
	       
	     
	}

}
