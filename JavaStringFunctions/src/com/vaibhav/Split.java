package com.vaibhav;

//split()=> method splits this string  and returns a char array.
public class Split {

	public static void main(String[] args) {

		String s1 = "My name is vaibhav ";
		String[] words = s1.split("\\s");// splits whitespace
			for(String w:words){ 
			  System.out.println(w);//
			  }
		  System.out.println("========================");
		     //String split()=> method with length example
		     String s11="My name is vaibhav";  
		     System.out.println("words:");  
		     for(String w:s11.split("\\s",0)){  
		     System.out.println(w);  
		     }  
		     System.out.println("========================");
		     System.out.println("words:");  
		     for(String w:s11.split("\\s",2)){  
		     System.out.println(w);  
		     
		     
		     }  
		 
	}
}
