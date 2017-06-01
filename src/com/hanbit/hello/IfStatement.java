package com.hanbit.hello;

public class IfStatement {

	public static void main(String[] args) {
		int number = 6;
		
		if (number > 4) {
			System.out.println("4보다 큽니다.");
		}
		else if (number > 5) {
			System.out.println("5보다 큽니다.");
		}		 
		else {
			System.out.println("5보다 크지 않고 4보다도 크지 않다.");
		}
	}
	
}
