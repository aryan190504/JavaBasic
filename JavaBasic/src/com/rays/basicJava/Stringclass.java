package com.rays.basicJava;

public class Stringclass {
	public static void main(String[]args) {
		String name = "vijay dinanath chouchan";
		System.out.println(name);
		System.out.println("name length =" + name.length());
		System.out.println("7 char ="+ name.charAt(6));
		System.out.println("index of ="+ name.indexOf("dina"));
		System.out.println("first i position-" + name.indexOf("i"));
		System.out.println("Last i positon-" + name.lastIndexOf("i"));
		System.out.println("a is replaced by b-" + name.replace("a","b"));
		System.out.println("chhota vijay-" + name.toLowerCase());
		System.out.println("bada vijay-" + name.toUpperCase());
		System.out.println("ends with han-" +name.endsWith("han"));
		System.out.println("substring-" +name.substring(6));
		System.out.println("starts with vijay-" +name.startsWith("vijay"));
		
		
		
}

}
