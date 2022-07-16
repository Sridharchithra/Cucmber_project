package com.Java_Buff;

public class Method_Overriding2 extends Method_Overriding1 {

	public void name() {
		super.name();
	}

	public void name1(int a) {
		super.name1(a);
	}

	public void name2(float b) {
		super.name2(b);
	}

	public void name3(char c) {
		super.name3(c);
	}
public static void main(String[] args) {
	
	Method_Overriding2 obj=new Method_Overriding2();
	obj.name();
	obj.name1(23445);
	obj.name2(2.078645f);
	obj.name3('d');
}
	
}
