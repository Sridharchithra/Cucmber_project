package com.Java_Buff;

public class Inherits_Multilevel  extends Inheritance_Single1 {
 public void  child() {
	 System.out.println("sri");
	 
		

	}
	public static void main(String[] args) {
		
		Inherits_Multilevel c=new Inherits_Multilevel();
		c.grandfather();
		c.father();
		c.child();
		
	}
		
	}
	


