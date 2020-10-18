package com.vaibhav;

public class GetByte {

	public static void main(String[] args) {
		
		String s1 = "PQRSTUV";
		
		byte[] b = s1.getBytes();
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		//Getting String back
		String s2 = new String(b);
		System.out.println(s2);
				

	}

}
