package com.vaibhav;

public class Contains {
	
	static String name ="Hi my name is vaibhav";
	
	static String str = "Hi my name is ABC";
	
	public static String contain() {
		
		System.out.println(name.contains("Hi"));//true
		System.out.println(name.contains("vaibhav"));//true
		
		System.out.println(name.contains("java"));//false
		
		return name;
		
	}
	

	public static String contain1() {
		
		
		System.out.println(name.contains("my"));
		
		return str;
		
	}
	

	public static void main(String[] args) {
		
		
		
		Contains.contain();
		Contains.contain1();
		
		

	}

}
