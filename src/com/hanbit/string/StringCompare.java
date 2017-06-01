package com.hanbit.string;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = null;
		String str2 = "Hanbit";
		String str3 = new String("Hanbit");
		String str4 = new String("Hanbit");
		String str5 = "hanbit";
		String str6 = "haobit";
		
		System.out.println(str2.equals(str5));
		System.out.println(str2.equalsIgnoreCase(str5));
		
		System.out.println(str5.compareTo(str6));
	}
	
}
