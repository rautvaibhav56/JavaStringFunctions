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
		System.out.println(s1.endsWith("how"));
		System.out.println(s1.endsWith("are"));
		System.out.println(s1.endsWith("you"));
		return s1;
	}

	
	/*
	 * public static String m2() { System.out.println("++++++++++++++++++++");
	 * System.out.println(s1.endsWith("c")); System.out.println(s1.endsWith("abc"));
	 * System.out.println(s1.endsWith("you")); return s2; }
	 * 
	 */
	public static void main(String[] args) {

		EndsWith.m();
		EndsWith.m1();
		// EndsWith.m2();

		/*
		 * System.out.println(s1.endsWith("u")); System.out.println(s1.endsWith("you"));
		 * 
		 * System.out.println(s1.endsWith("Hello how are you")); //true for complete
		 * statement
		 * 
		 * System.out.println(s1.endsWith("Hello"));//false
		 * 
		 * 
		 * 
		 * System.out.println(str.endsWith("space")); if(str.endsWith("space")) {
		 * System.out.println("strig ends with space"); }else
		 * System.out.println("It does not ends with space");
		 * 
		 */

	}

}
