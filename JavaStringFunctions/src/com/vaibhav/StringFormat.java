package com.vaibhav;

public class StringFormat {

	public static void main(String[] args) {
		
		 	String str1 = String.format("%c", 'c');  
		
		 	String str2 = String.format("%d", 10);
		   
	        String str3 = String.format("%s", "Virat Kohli");  
	        
	        String str4 = String.format("%f", 10.00);    
	        
	        String str5 = String.format("%x", 80);    //hexadecimal value  
	        
	        String str6 = String.format("%o", 80); //octal value
	        
	        
	        System.out.println(str1);  
	        System.out.println(str2);  
	        System.out.println(str3);  
	        System.out.println(str4);  
	        System.out.println(str5);  
	        System.out.println(str6);
	}

}
