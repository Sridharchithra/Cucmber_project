package com.Interface_Abstract;

public class Loan2  implements Loan {

	@Override
	public void pl() {
		System.out.println("sri");
		
	}

	@Override
	public void homeloan() {
		System.out.println("sridhar");
		
	}
public static void main(String[] args) {
	Loan2 o=new Loan2();
	o.homeloan();
	o.pl();
}
	
	
}
