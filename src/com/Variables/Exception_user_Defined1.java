package com.Variables;

public class Exception_user_Defined1 {

	public static void main(String[] args) {
int a=10;
int b=20;

    try {
    	if(a>=b) {
    		System.out.println("true");
    	}
    	else {
    	throw new Exception_user_Defined("with construtor");
    	}
    }catch( Exception e) {
    	System.out.println(e);
    }









	}}
