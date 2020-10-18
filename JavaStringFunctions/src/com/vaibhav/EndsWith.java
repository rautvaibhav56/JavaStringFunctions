package com.vaibhav;

public class EndsWith {

	public static void main(String[] args) {
		String s1 = "Hello how are you";
		System.out.println(s1.endsWith("u"));
		System.out.println(s1.endsWith("you"));
		
		System.out.println(s1.endsWith("Hello how are you")); //true for complete statement
		
		System.out.println(s1.endsWith("Hello"));
		
	
		String str = "Welcome to my work space";
		System.out.println(str.endsWith("space"));
		if(str.endsWith("space")) {
			System.out.println("strig ends with space");	
		}else System.out.println("It does not ends with space");

	}

}
