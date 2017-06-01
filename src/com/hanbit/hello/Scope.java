package com.hanbit.hello;

public class Scope {
	
	int index = 8; // 멤버변수(Member Variable)

	public static void main(String[] args) {
		int number = 4; // 지역변수(Local Variable)
		
		{
			// Indentation ****
			int number2 = 8; // 지역변수(Local Variable)
			System.out.println(number2);
			System.out.println(number);
		}
		
		System.out.println(number);
	}
	
}
