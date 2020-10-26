package com.vaibhav;

//StringJoin=>join() method returns a string joined with given delimiter
public class StringJoin {

	static	String date = String.join("/","25","06","2018\n");  //??doubt

	static	String time = String.join(":","12","10","10"); 

	static  String name=String.join("-", "my","name","is","vaibhav");
	
	public static void m() {
		
		System.out.println(name);
		System.out.println("==============");
		System.out.print(date);    
		System.out.println("==============");   
	    System.out.println(time); 
		
	}
	
	

	public static void main(String[] args) {
		
		StringJoin.m();
	
		 
	}

}




