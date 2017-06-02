package com.hanbit.syntax;

// 제어문
public class ControlFlowStatements {

	void desc() {
		int num = 3;
		
		// 1. 분기문 (Decision-making Statements)
		// 1-1. if-then
		if (num > 5) {
			
		}
		
		// 1-2. if-else-then
		if (num > 4) {
			int x = 3; // 지역변수
		}
		else if (num > 0) { // else if 는 0개 이상 쓸 수 있다.
			int x = 5;
		}
		else if (num < -1) {
			
		}
		else { // else는 0 또는 1개 쓸 수 있다.
			
		}
		
		// 1-3. switch
		switch (num) {
			case 1: {
				break; // break를 만나면 switch 종료
			}
			case 2: {
				// break가 없으면 다음 case 조건을 비교하지 않고 다음 case 실행
			}
			case 3: {
				break;
			}
			default: { // case 비교값이 만족하지 않을때 실행 (생략 가능)
				
			}
		}
		
		// 2. 반복문 (Looping Statements)
		// 2-1. while
		while (num > 4) { // 조건식이 true 이면 블록 내용을 반복 실행
			
		}
		
		// 2-2. do-while
		do {
			// 조건식 비교 전 무조건 1회 실행
		} while (num > 4); // 조건식이 true 이면 블록 내용을 반복 실행
		
		// 2-3. for
		for (int i=0; i<5; i++) { // for (초기화문; 조건식; 증감문)
			
		}
		
		for (num = 4; num < 9 && num > 2; num = num + 5) {
			
		}
		
		// 2-4. for-each
		int[] numbers = {1, 4, 8, 10};
		for (int number : numbers) {
			
		}
	}
	
}
