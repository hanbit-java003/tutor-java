package com.hanbit.syntax;

// 클래스
public class Classes {

	// 멤버 속성(Member Properties)
	int count;
	String name;
	
	// 생성자(Constructors)
	public Classes() { // 기본생성자: 생성자를 만들지 않으면 기본 사용가능
		
	}
	
	// 멤버 메소드(Member Methods)
	int plus(int x, int y) { // 반환타입 메소드명(매개변수) { return 반환값 }
		return 0; // return 표현식; (표현식의 결과는 반환타입과 호환되어야 함)
	}
	
	void print() { // 반환하지 않는 메소드는 반환타입을 void 로 씀
		// 반환하지 않는 메소드는 return 생략 가능
	}
	
}
