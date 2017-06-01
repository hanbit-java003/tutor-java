package com.hanbit.math;

public class MultiplicationTable {

	public static int printTimes;
	
	private int dan;
	
	public MultiplicationTable(int dan) {
		this.dan = dan;
	}
	
	public void print() {
		print(1, 9);
	}
	
	public void print(int start, int end) {
		printTimes++;
		
		for (int num=start; num<=end; num++) {
			System.out.println(dan + " x " + num + " = " + (dan*num));
		}
		
		System.out.println("===================");
	}
	
}
