package com.vaibhav;

public class GetChar {

	public static void main(String[] args) {
	
		String str = new String("hello java");
		
		char[] ch = new char[10];
		
		try {
			
	
		
		str.getChars(6,10,ch,0);
		
		System.out.println(ch);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
