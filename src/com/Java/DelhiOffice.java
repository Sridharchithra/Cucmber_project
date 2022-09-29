package com.Java;

public class DelhiOffice extends office {
	public static void main(String[] args) {
		ibank bank=new DelhiOffice();
		bank.deposit();
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit");
		
	}


}
interface ibank{
	void withdraw();
	void deposit();
	
}


abstract class office implements ibank{
	@Override
	public void withdraw() {
	System.out.println("amount deposit");
		
	}
}