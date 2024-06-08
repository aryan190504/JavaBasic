package com.rays.basicJava;

public class Loginid {
public static void main (String[]args) {
	String loginId= "abc@gmail.com";
	String password= "pass1234";
	
	if (loginId =="" && password=="") {
		
		System.out.println("login ID is reqired");
	    System.out.println("Password is required");
	    }
else if (loginId =="abc@gmail.com" && password =="pass1234")
	{
	System.out.println("login successfully");
   } else { 
	   System.out.println("Invalid login id");
   }
	
}

}
	   
   
   
