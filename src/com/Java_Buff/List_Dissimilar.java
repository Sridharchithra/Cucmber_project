package com.Java_Buff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Dissimilar {
public static void main(String[] args) {
	List <Object> o=new ArrayList <Object>();
	o.add(1);
	o.add("java");
	o.add(2);
	System.out.println("o list : "+o);
	List <Object>  l =new LinkedList <Object>();
	l.add(1);
	l.add(3);
	l.add("java");
	System.out.println("l lis : "+l);
	// give same value
	boolean b = o.retainAll(l);
	System.out.println("retain : "+o);
	//remove same value
//	boolean  a = o.removeAll(l);
//	System.out.println("remove : "+o);
	l.clear();
	System.out.println("l clear : "+l);
}

}
