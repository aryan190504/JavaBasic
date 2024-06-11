package com.rays.basicJava;

public class ConsonantsCount {
	
	public static void main(String[] args) {
		
		String name = "abcdefghijklmnopqrstuvwxyz";
		int count = 0;
		
		for(int i = 0; i<name.length(); i++)
		{
			char c = name.charAt(i);
			
			if ( c != 'a' || c != 'e' || c != 'i' || c != 'o' || c !='u' ){
				count++;
			}
		}
		System.out.println("Consonants " + count);
		
	}

}
