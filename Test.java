package com.tcs;

public class Test {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello"); // creates a new object in stack 
		
		System.out.println(s1 == s2); //== and .equal() both are meant for 
		System.out.println(s1 == s3); //reference comparison in Object class.
		
		System.out.println(s1.equals(s2)); // But String class override the .equal() for
		System.out.println(s1.equals(s3)); // content comparison and Hence True for same content.
		
		String e = new String("JavaScript");
		String f = new String("JavaScript");
		
		if(e!=f) {
			System.out.println("Two String has same content but pointing to different object");
		}
		
	}
}
