package com.hanbit.math;

public class MultiplicationTableApp {

	public static void main(String[] args) {
		for (int dan=2; dan<=9; dan++) {
			MultiplicationTable table = new MultiplicationTable(dan);
			table.print(11, 19);
			
			System.out.println(table.printTimes + "번 출력했습니다.");
		}
	}
	
}
