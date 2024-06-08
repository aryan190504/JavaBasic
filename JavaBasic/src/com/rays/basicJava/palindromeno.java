package com.rays.basicJava;

public class palindromeno {
	public static void main(String[]args) {
		
		int n = 1441;
		int r, sum=0, temp;
		
		temp=n;
		while(n>0) {
			r= n%10;
			sum =(sum*10)+r;
			n= n/10;
			}
		if (temp==sum) {
			System.out.println("it is palindrome No.");
		}else {
			System.out.println("it is not palindrome No.");
		}
		
	}

}
