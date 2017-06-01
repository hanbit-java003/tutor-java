package com.hanbit.math;

/**
 * 계산기 클래스
 * 
 * @author 김판기
 * @version 1.0
 *
 */
public class Calculator {

	private double result;
	
	/**
	 * 현재까지 계산된 결과를 반환합니다.
	 * 
	 * @return 계산된 결과
	 */
	public double getResult() {
		return result;
	}

	/**
	 * 현재까지 계산된 결과에 입력된 숫자를 더합니다.
	 * 
	 * @param number 더할 숫자
	 */
	public void plus(int number) {
		result += number;
	}

	/**
	 * 현재까지 계산된 결과에서 입력된 숫자를 뺍니다.
	 * 
	 * @param number 뺄 숫자
	 */
	public void minus(int number) {
		result -= number;
	}

	/**
	 * 현재까지 계산된 결과에 입력된 숫자를 곱합니다.
	 * 
	 * @param number 곱할 숫자
	 */
	public void multiply(int number) {
		result *= number;		
	}

	/**
	 * 현재까지 계산된 결과를 입력된 숫자로 나눕니다.
	 * (단, 0으로 나누면 계산하지 않습니다.)
	 * 
	 * @param number 나눌 숫자
	 */
	public void divide(int number) {
		// 숫자를 0으로 나누면 NaN(Not a Number)이 된다.
		if (number == 0) {
			return;
		}
		
		result /= number;		
	}

	/**
	 * 계산결과를 0으로 초기화합니다.
	 */
	public void clear() {
		result = 0;		
	}
	
}
