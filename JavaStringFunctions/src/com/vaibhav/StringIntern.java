package com.vaibhav;

//StringIntern=>It can be used to return string from memory, 
//if it is created by new keyword. It creates exact copy of heap string object in string constant pool
public class StringIntern {

	static String s1 = "hello";
	static String s2 = new String("hello");

	public static void m() {

		System.out.println(s1.equals(s2));// true =>why true???

		System.out.println(s1 == s2);// false

		String s3 = s2.intern();// It returns string from memory, if it is created by new keyword.
		System.out.println(s1 == s3);// true

	}

	public static void main(String[] args) {

		StringIntern.m();
	}

}
