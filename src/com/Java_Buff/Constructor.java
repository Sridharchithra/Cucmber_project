package com.Java_Buff;

public class Constructor {
 public Constructor() {
	System.out.println(" ;");//non parameterized
 }
 public  Constructor(int a) {
	 System.out.println(a);//parameterized
 }
 public  Constructor (String b) {
	 System.out.println(b);
 }
 public  Constructor (float f) {
	 System.out.println(f);
 }
 public static void main(String[] args) {
	 Constructor a=new Constructor();
	 Constructor a1=new Constructor(12345);
	 Constructor a2=new Constructor("sri");
	 Constructor a3=new Constructor(1.5678f);
	 
}
}