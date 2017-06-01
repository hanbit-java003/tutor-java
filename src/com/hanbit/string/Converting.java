package com.hanbit.string;

public class Converting {

	public static void main(String[] args) {
		int number = 100;
		
		String numberStr = String.valueOf(number);
		int number2 = Integer.valueOf(numberStr);
		
		String booleanStr = "true";
		boolean booleanValue = Boolean.valueOf(booleanStr);
		
		String doubleStr = "1.5";
		double doubleValue = Double.valueOf(doubleStr);
		
		System.out.println(doubleValue);
	}
	
}
