package com.vaibhav;
//String value Of=>It converts different types of values into string

public class StringValueOf {
	
	static  boolean b1=true;  
	static    byte b2=11;    
	static  short sh = 12;  
	static  int i = 13;  
	static  long l = 14L;  
	static  float f = 15.5f;  
	static  double d = 16.5d;  
	static  char chr[]={'j','a','v','a'};  
 
	
	public static void valueOf() {
		
		
		      StringValueOf obj=new StringValueOf();  
	        	
			  String s1 = String.valueOf(b1); System.out.println("boolean:"+s1);
			  
			  String s2 = String.valueOf(b2); System.out.println("byte:"+s2);
			  
			  String s3 = String.valueOf(sh); System.out.println("short:"+s3);
			  
			  String s4 = String.valueOf(i); System.out.println("int"+s4);
			  
			  String s5 = String.valueOf(l); System.out.println(s5);
			  
			  String s6 = String.valueOf(f); System.out.println(s6);
			  
			  String s7 = String.valueOf(d); System.out.println(s7);
			  
			  String s8 = String.valueOf(chr); System.out.println(s8);
			  
			  String s9 = String.valueOf(obj); System.out.println(s9);
			
	}
	
	

	public static void main(String[] args) {
		StringValueOf.valueOf();
		
	       
	}

}
