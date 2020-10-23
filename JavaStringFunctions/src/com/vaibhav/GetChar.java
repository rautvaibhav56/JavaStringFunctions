package com.vaibhav;

public class GetChar {

	static String str = new String("hello java");
	
	static char[] ch = new char[10];
	
	public static void m01() {
	
		try {
			str.getChars(6,10,ch,0);
			//getChars(int srcBeginIndex,int srcEndiNDEX,char[]destination,int dstBeginIndex
			
			System.out.println(ch);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		
}
	
	
	
	public static void main(String[] args) {
		
		GetChar.m01();//java
	
				
	}

}
