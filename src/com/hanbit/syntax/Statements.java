package com.hanbit.syntax;

public class Statements {

	// 1. 선언문 (Declaration Statements)
	// 데이터타입 변수명;
	int number = 3;
	String str = "";
	Long longNumber;
	
	int plus(int x, int y) {
		return x + y;
	}

	void desc() {
		// 2. 대입문 (Assignment Statements)
		// 좌변 = 우변;
		// 좌변: 변수
		// 우변: 표현식(Expressions, 결과가 1개인 식)
		//       조건식(Conditions, 결과가 true이거나 false인 식)
		str = "abc"; // 값(Literals)
		number = 5 + 7; // 표현식
		boolean result = number < 100; // 조건식
		int sum = plus(5, 9); // 표현식(반환이 있는 메소드호출)
		sum = plus(4, 8) - 8; // 표현식
		String str = new String("abcd"); // 객체 생성
		Object obj = new Object(); // 객체 생성
		
		// 3. 메소드 호출
		plus(5, 9); // 반환이 있는 메소드 호출
		System.out.println("hello"); // 반환이 없는 메소드 호출
		
		// 4. 증감문 (Increment/Decrement Statements)
		number++; // number = number + 1;
		++number;
		sum--; // sum -= sum;
		--sum;
	}
	
}
