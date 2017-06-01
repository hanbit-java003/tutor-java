package com.hanbit.hello;

public class Operators {

	public static void main(String[] args) {
		int number = 1;
		
		number = number + 1;
		number += 1;
		
		number = number - 1;
		number -= 1;
		
		number = number * 3;
		number *= 3;
		
		number = number / 2;
		number /= 2;

		number = number % 2;
		number %= 2;
		
		// < , > , <= , >= , == , !=
		boolean result = !(1 != 1);
		
		result = 1 > 0 && 1 > 4;
		result = 1 > 0 || 1 > 4;
		
		result = 'A' > 'a';
		
		System.out.println(result);
	}
	
}
