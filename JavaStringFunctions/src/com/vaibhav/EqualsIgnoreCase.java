package com.vaibhav;
//EqualsIgnoreCase=>It ignores the camel casing
public class EqualsIgnoreCase {
	
	
	static String s1 = "java string";
	
	static String s2 = "JAVA STRING";
	
	public static String m() {
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		return s2;
		
	}
	

	public static void main(String[] args) {
		
		EqualsIgnoreCase.m();
				
		
	}

}
