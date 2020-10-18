package com.vaibhav;

import java.util.ArrayList;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		
		String str1 = "virat kohli";
		ArrayList<String>list = new ArrayList<>();
		list.add("VIRAT");
		list.add("KOHLI");
		list.add("VIRAT KOHLI");
		
		for(String str : list) {
			if(str.equalsIgnoreCase(str1)) {
				System.out.println("Virat Kohli is caption of Indian cricket team");
				
				
				
				String s1 = "java string";
				String s2 = "JAVA STRING";
				String s3 = "python";
				
				System.out.println("==============================");
				System.out.println(s1.equalsIgnoreCase(s2));
				System.out.println(s1.equalsIgnoreCase(s3));
				
			}
		}
	}

}
