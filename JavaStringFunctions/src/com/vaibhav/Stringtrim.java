package com.vaibhav;
//String trim=> eliminates leading and trailing spaces.
public class Stringtrim {

	public static void main(String[] args) {
		String s1="  hello there   ";  
		System.out.println(s1+"java");//without trim 
		System.out.println(s1.trim()+"java");//with trim
		
		System.out.println("=========================");
		
		//length of string also reduce as spaces are removed
		 String s11 ="  hello java string   ";  
	        System.out.println(s11.length());  
	        System.out.println(s11); //Without trim()  
	        String tr = s11.trim();  
	        System.out.println(tr.length());  
	        System.out.println(tr); //With trim()  

	}

}
