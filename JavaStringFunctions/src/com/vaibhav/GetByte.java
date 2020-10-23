package com.vaibhav;
//GetByte=> It gives the bye code for given string 
public class GetByte {
	
	
	static	String s1 = "PQRSTUV";
	
	static byte[] b = s1.getBytes();
	
	public static void m1() {
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		//Getting String back
		String s2 = new String(b);
		System.out.println(s2);
		
	}
	
	

	public static void main(String[] args) {
		
		GetByte.m1();
		
				

	}

}
