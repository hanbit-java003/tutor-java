package com.hanbit.math;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.plus(5);
		calc.minus(4);
		
		calc.clear();
		
		calc.multiply(9);
		calc.divide(0);
		calc.plus(7);
		
		System.out.println(calc.getResult());
	}
	
}
