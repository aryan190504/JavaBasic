package com.rays.basicJava;

public class notecount {
	public static void main(String[]args) {
		
		int[] notes= {500,200,100,50,20,10,5,3,2,1};
		
		System.out.println("length of notes="+ notes.length);
		
		int rupees=126;
		
		int count =0;
		
		for(int i=0; i<notes.length; i++) {
			count=rupees/notes[i];
			if (count>0) {
				System.out.println(notes[i]+"count="+count);
			}
			rupees= rupees%notes[i];
		}
				 
		
	}

}
