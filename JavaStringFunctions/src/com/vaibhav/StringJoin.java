package com.vaibhav;

//StringJoin=>join() method returns a string joined with given delimiter
public class StringJoin {

	public static void main(String[] args) {
		
		String joinString1=String.join("-","hi","my","name","is","vaibhav");  
		System.out.println(joinString1);  
		
		
		//FOR DATE N TIME
		 String date = String.join("/","25","06","2018\n");    
	        System.out.print(date);    
	        String time = String.join(":","12","10","10");  
	        System.out.println(time);  
	}

}
