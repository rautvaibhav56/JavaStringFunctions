package com.vaibhav;

public class GetChar {

	static String str = new String("hello java");
	
	static char[] ch = new char[10];
	
	//getChars(int srcBeginIndex,int srcEndiNDEX,char[]destination,int dstBeginIndex
	public static void m(int srcBeginIndex,int srcEndiNDEX,char[]destination,int dstBeginIndex) {
		try {
			
			str.getChars(6,10,ch,0);
			
			System.out.println(ch);
			
			} catch (Exception e) {
				
				System.out.println(e);
			}
			
		
}
		
	
	
	
	public static void main(String[] args) {
		
		GetChar.m(6,10,ch,0);//java
	

				
	}

}
