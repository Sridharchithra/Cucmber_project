package com.Java;

public class OrderofExecution {
	OrderofExecution(){
		System.out.println("constructor");
	}
	public void display() {
	
System.out.println("display method");
	}
	{
		System.out.println("instance block");
	}
	
	static {
		System.out.println("static");
	}
	
	
	
	

	public static void main(String[] args) {
		OrderofExecution o=new OrderofExecution();
		o.display();

		

	}

}
