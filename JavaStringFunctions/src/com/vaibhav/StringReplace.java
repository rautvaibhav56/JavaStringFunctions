//replace(), replaceAll()    => what is the major diff??
package com.vaibhav;

//StringReplace=>replace() method  replaces all the old char by new char or CharSequence.
public class StringReplace {

	public static void main(String[] args) {
		
		  
		  String str = "oooooo-hhhh-oooooo"; String rs = str.replace("h","s"); //
		 // Replace h by s
		  System.out.println(rs);
		  
		 rs = rs.replace("s","h"); // Replace s by h
		 System.out.println(rs);
		  
		System.out.println("==============================");
		String str1 = "hi my name is vaibhav";
		String s1 = str1.replace("hi my name is vaibhav", "vaibhav");
		System.out.println(s1);
		System.out.println("===============================");
		
		
		
		// String replaceAll() => replace character
		
		String s11="a a a e e e a a a ";  
		String replaceString=s11.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
		
		//String replaceAll()=> remove white spaces
		System.out.println("=================");
		String s12="My name is vaibhav. My surname is Raut.";  
		String replaceStrings=s12.replaceAll("\\s","");  
		System.out.println(replaceStrings);  
	}

}
