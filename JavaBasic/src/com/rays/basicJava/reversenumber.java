package com.rays.basicJava;

public class reversenumber {
	public static void main(String[]args) {
		
		int no=123;
		int temp = no;
		int r;
		int sum=0;
		
		while (temp >0) {
			
			r = temp % 10;
			
			sum= (sum * 10)+ r;
			
			temp = temp/10;
			
		}
		System.out.println(sum);
	}

}
