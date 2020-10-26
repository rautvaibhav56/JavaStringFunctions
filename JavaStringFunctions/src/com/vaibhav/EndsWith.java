package com.vaibhav;

public class EndsWith {
	static String s1 = "Hello how are you";

	static String s2 = "my name is abc";

	public static String m() {

		System.out.println(s1.endsWith("a"));
		System.out.println(s1.endsWith("u"));
		System.out.println(s1.endsWith("you"));
		return s1;
	}

	public static String m1() {
		System.out.println("=================");
		System.out.println(s2.endsWith("how"));
		System.out.println(s2.endsWith("are"));
		System.out.println(s2.endsWith("abc"));
		return s1;
	}

	
	public static void main(String[] args) {

		EndsWith.m();
		EndsWith.m1();
		// EndsWith.m2();

	}

}
