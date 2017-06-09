package com.hanbit.string;

public class StringMethod {

	public static void main(String[] args) {
		String firstName = "John";
		String lastName = new String("Park");
		
		int lengthOfFirstName = firstName.length();
		String lowerFirstName = firstName.toLowerCase();
		String upperFirstName = firstName.toUpperCase();
		
		String banana = "banana";
		
		int index = banana.lastIndexOf("an");
		boolean match = banana.matches("b(a|n)+");
		
		String trimed = "  hello    ".trim();
		String substr = "Hanbit".substring(1, 4);
		String substr2 = "Hanbit".substring(2);
		
		String apple = "apple".replace("p", "P");
		
		System.out.println(index);
	}
	
}
