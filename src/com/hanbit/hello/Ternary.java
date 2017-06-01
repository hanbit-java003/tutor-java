package com.hanbit.hello;

public class Ternary {

	public static void main(String[] args) {
		// unary : 한개의
		// binary : 두개의
		// ternary : 세개의
		// 조건식 ? true일때 표현식 : false일때 표현식
		int number = 8;
		
		String result = number % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(number + "는 " + result);
	}
	
}
