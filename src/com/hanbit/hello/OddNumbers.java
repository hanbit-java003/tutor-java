package com.hanbit.hello;

public class OddNumbers { // EvenNumbers

	public static void main(String[] args) {
		int start = -5;
		int end = 5;
		
		for (int number=start; number<=end; number++) {
			if (number > 0) {
				if (number % 2 != 0) {
					System.out.println(number + "는 홀수");
				}
				else {
					System.out.println(number + "는 짝수");
				}
			}
			
			System.out.println("다음으로 넘어갑니다.");
		}
	}
	
}
