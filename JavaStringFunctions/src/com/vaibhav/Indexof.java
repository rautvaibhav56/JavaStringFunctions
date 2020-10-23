package com.vaibhav;

public class Indexof {
	
	static	String s1 = "This is indexOf method";     

		
	public static String m() {
		
		    
	       
		 //String indexOf(int char, int fromIndex)  =>It gives index of req char 
		
	        int index = s1.indexOf('e', 12);  
	        System.out.println("-----------------");
	        System.out.println("index of char "+index);  //It prints index e after 12  
	        
	        // String indexOf(int ch) =>position of given char value 
	          
	      int index1=s1.indexOf("is");//returns the index of is substring  
	      int index2=s1.indexOf("index");//returns the index of index substring  
	      System.out.println("-----------------");
	      System.out.println(index1+"  "+index2);//2,8
	        
	      
	      //String indexOf(String substring)
	                
	         int index3 = s1.indexOf("method"); //Returns the index of this substring  
	        System.out.println("-----------------");
	        System.out.println("index of substring "+index3);  //16        
	        
	        
	        // String indexOf(String substring, int fromIndex)
	              
	       
	        int index4 = s1.indexOf("method", 10); //Returns the index of this substring  
	        System.out.println("index of substring "+index4);  //16
	        index = s1.indexOf("method", 24); // It returns -1 if substring does not found  
	        System.out.println("index of substring "+index); //-1 
	        
			return s1;
	    
		
		
		
	}

	public static void main(String[] args) {
		
		Indexof.m();
		    
	    }  
	      
	    }  



