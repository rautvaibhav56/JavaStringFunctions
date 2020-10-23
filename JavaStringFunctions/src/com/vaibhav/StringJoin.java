package com.vaibhav;

//StringJoin=>join() method returns a string joined with given delimiter
public class StringJoin {
	
//	static String joinString1=String.join("-","hi","my","name","is","vaibhav"); 
	static String joinString1=" hi my name is vaibhav";
	
	static String s0;
	static String s1;
	
	//FOR DATE N TIME
	static	 String date = String.join("/","25","06","2018\n");    
	static	String time = String.join(":","12","10","10"); 
	
	
	public static void m() {
	//	System.out.println(joinString1);  
		
		System.out.println(String.join("-", "hi","my","name","is","vaibhav"));
		System.out.println("==============");
		System.out.print(date);    
		System.out.println("==============");   
	    System.out.println(time); 
		
	}
	
	public static void m1(String s0,String s1 ) {
		System.out.println("-------------");
		System.out.println(String.join(s0,s1));
		
	}

	public static void main(String[] args) {
		
		StringJoin.m();
		
		StringJoin.m1("-","my name is ABC");	//?? no required o/p
		 
	}

}




