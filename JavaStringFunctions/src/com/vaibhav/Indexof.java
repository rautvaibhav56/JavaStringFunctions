package com.vaibhav;

public class Indexof {

	public static void main(String[] args) {
		 String s1 = "This is indexOf method";         
	       
		 //String indexOf(int char, int fromIndex)  =>It gives index of req char 
	        int index = s1.indexOf('e', 12);  
	        System.out.println("index of char "+index);  //It prints index e after 12  
	        
	        // String indexOf(int ch) =>position of given char value 
	        String s2="this is index of example";   
	      int index1=s2.indexOf("is");//returns the index of is substring  
	      int index2=s2.indexOf("index");//returns the index of index substring  
	      System.out.println(index1+"  "+index2);//2,8
	        
	      
	      //String indexOf(String substring)
	      
	      String s3 = "This is indexOf method";         
	            
	        int index3 = s3.indexOf("method"); //Returns the index of this substring  
	        System.out.println("index of substring "+index3);  //16        
	        
	        
	        // String indexOf(String substring, int fromIndex)
	        
	        String s4 = "This is indexOf method";         
	       
	        int index4 = s4.indexOf("method", 10); //Returns the index of this substring  
	        System.out.println("index of substring "+index4);  //16
	        index = s4.indexOf("method", 20); // It returns -1 if substring does not found  
	        System.out.println("index of substring "+index); //-1 
	        
	    }  
	      
	    }  



