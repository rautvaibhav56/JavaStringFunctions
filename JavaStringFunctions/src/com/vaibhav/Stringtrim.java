package com.vaibhav;
//String trim=> eliminates leading and trailing spaces.

public class Stringtrim {

	static String s1="  hello there   ";
	static String s11 ="  hello java string   ";  
	
	public static void trim() {
		
		//without trim 
		System.out.println(s1+"java");
		//with trim
		System.out.println(s1.trim()+"java");
		
		System.out.println("=========================");
		
//length of string also reduce as spaces are removed
	        System.out.println(s11.length());  
	      //Without trim() 
	        System.out.println(s11);
	      //With trim()  
	        String tr = s11.trim();  
	        System.out.println(tr.length());  
	        System.out.println(tr); 

		
	}
	
	public static void main(String[] args) {
		
		Stringtrim.trim();
	
	}

}
