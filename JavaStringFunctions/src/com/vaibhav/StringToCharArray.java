package com.vaibhav;
//StringToCharArray=>This method converts this string into character array

public class StringToCharArray {
	
	static private String s1 = "Hi my name is vaibhav"; 
	
	
	public static String mn() {
		
		 char[] ch = s1.toCharArray();  
	        
	        int len = ch.length;  
	        
	        System.out.println("Char Array length: " + len); 
	        
	        System.out.println("Char Array elements: ");  
	        
	        for (int i = 0; i < len; i++) {  
	            System.out.println(ch[i]);  
	
	
		}
			return s1;
		
	}
	
	public static void main(String[] args) {
		StringToCharArray.mn();
		
	       }

}
