package com.vaibhav;

public class Contains {
	
	
	
	static String name ="Hi my name is vaibhav";
	
	static String str = "Hi my name is ABC";
	
	public static String contain() {
		
		System.out.println(name.contains("Hi"));
		System.out.println(name.contains("vaibhav"));
		
		return name;
		
	}
	

	public static String contain1() {
		
		
		System.out.println(name.contains("my"));
		
		return str;
		
	}
	

	public static void main(String[] args) {
		
		
		
		Contains.contain();
		Contains.contain1();
		
		/*
		 * System.out.println(name.contains("Hi"));//
		 * 
		 * System.out.println(name.contains("my"));//
		 * 
		 * System.out.println(name.contains("name"));
		 * 
		 * System.out.println(name.contains("is"));
		 * 
		 * System.out.println(name.contains("vaibhav"));
		 * 
		 * System.out.println(name.contains("Hi my name is vaibhav"));
		 * 
		 * System.out.println(name.contains("Rahul"));
		 * 
		 * System.out.println(name.contains("Ram"));
		 */
		/*
		 * if(str.contains("vaibhav")) { System.out.println("string contains vaibhav");
		 * }else System.out.println("Result not found");
		 */
		

	}

}
