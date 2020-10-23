package com.vaibhav;
//Substring => It return part of string
public class Substring {

	static String s1="javaWorld";  
	
	//1>String substring(int startIndex) 
	public static void sub(int i) {
		
		System.out.println(s1.substring(i));
		
	}
	
	
    //2> String substring(int startIndex, int endIndex)
	public static void sub2(int i,int j) {
		 System.out.println(s1.substring(i,j));
	}
	
	public static void main(String[] args) {
		
		Substring.sub(2);
		
		Substring.sub2(0,9);
	}

}
