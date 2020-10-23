package com.vaibhav;
//startsWith=>this method checks if this string starts with given prefix if yes then true else false

public class StartsWith {

	static String s1 = "My name is vaibhav";

	public static void m(String s) {

		System.out.println(s1.startsWith(s));

		/*
		 * //String startsWith() System.out.println(s1.startsWith("My"));
		 * System.out.println(s1.startsWith("name"));
		 * System.out.println(s1.startsWith("vaibhav"));
		 * System.out.println(s1.startsWith("is"));
		 * 
		 */

	}

	public static void m1(String str, int i) {

		// startsWith(String prefix, int offset)
		System.out.println(s1.startsWith(str, i));

		/*
		 * System.out.println(s1.startsWith("y",1));
		 * System.out.println(s1.startsWith("n",3));
		 * System.out.println(s1.startsWith("a",4))
		 */ 

	}

	public static void main(String[] args) {

		StartsWith.m("a");
		StartsWith.m("My");
		StartsWith.m("vaibhav");
		System.out.println("-----------------");
		
		StartsWith.m1("n", 3);

	}

}
