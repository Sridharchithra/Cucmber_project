package com.Java_Buff;

public class Casting_Parent {
public void student(String a) {
	System.out.println("student name:"+a);	
}
public void student(char b) {
	System.out.println("Gender:"+b);
}
	public void student(int c) {
		System.out.println("roll no:"+c);
	}
	public static void main(String[] args) {
		Casting_Parent o = new Casting_Child();
		o.student("sri");
		o.student('m');
		o.student(2020);
	}

	

}
