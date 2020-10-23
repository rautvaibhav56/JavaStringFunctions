package com.vaibhav;

public class String1 {
	
	//A]Created by using java string literal	
	static	String s1 = "java";
	
	//B]Created by using new keyword
	static	String s2=new String("string");
	
	
	//conversion of char array to string
	static	char ch[]= {'s','t','r','i','n','g' };
	
	static	String s3=new String(ch);


	public static void main(String[] args) {
		
				
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		

	}

}
