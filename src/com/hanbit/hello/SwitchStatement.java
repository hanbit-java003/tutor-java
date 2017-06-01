package com.hanbit.hello;

public class SwitchStatement {

	public static void main(String[] args) {
		char ch = 'b';
		
		if (ch == 'b') {
			System.out.println("b입니다.");
		}
		else {
			System.out.println("b가 아닙니다.");
			System.out.println("b를 입력하세요.");
		}
		
		/*switch (ch) {
			case 'a':
			case 'b':
			case 'c': {
				System.out.println("소문자입니다.");
				System.out.println("소문자입니다.");
				break;
			}
			case 'A':
			case 'B':
			case 'C':
				System.out.println("대문자입니다.");
				break;
			default: {
				System.out.println("영문자가 아닙니다.");
			}
		}*/
	}
	
}
