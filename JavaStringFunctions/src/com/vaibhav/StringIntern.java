package com.vaibhav;

public class StringIntern {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 =  new String("hello");
		
		System.out.println(s1.equals(s2));//true  =>why true
		System.out.println(s1==s2);//false
		
		String s3=s2.intern();//It returns string from memory, if it is created by new keyword.
		System.out.println(s1==s3);//true
		
	}

}
