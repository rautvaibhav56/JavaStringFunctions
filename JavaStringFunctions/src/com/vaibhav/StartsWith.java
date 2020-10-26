package com.vaibhav;
//startsWith=>this method checks if this string starts with given prefix if yes then true else false

public class StartsWith {

	static String s1 = "My name is vaibhav";

	public static void m(String s) {

		System.out.println(s1.startsWith(s));



	}

	// startsWith(String prefix, int offset)
	public static void m1(String str, int i) {

		System.out.println(s1.startsWith(str, i));

	}

	public static void main(String[] args) {

		StartsWith.m("a");
		StartsWith.m("My");
		StartsWith.m("vaibhav");
		
		System.out.println("-----------------");
		
		StartsWith.m1("n", 3);

	}

}
