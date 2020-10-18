package com.vaibhav;

public class Contains {

	public static void main(String[] args) {
		
		String name ="Hi my name is vaibhav";
		
		System.out.println(name.contains("Hi"));
		
		System.out.println(name.contains("my"));
		
		System.out.println(name.contains("name"));
		
		System.out.println(name.contains("is"));
		
		System.out.println(name.contains("vaibhav"));
		
		System.out.println(name.contains("Hi my name is vaibhav"));
		
		System.out.println(name.contains("Rahul"));
		
		System.out.println(name.contains("Ram"));
		
//-----------------------------------------------------------------------------
		String str = "Hi my name is vaibhav";
		if(str.contains("vaibhav")) {
			System.out.println("string contains vaibhav");
			}else
				System.out.println("Result not found");
		

	}

}
