package com.hanbit.array;

public class Multiply {

	public static void main(String[] args) {
		int dan = 3;
		String[] lines = new String[9];
		
		for (int i=0; i<lines.length; i++) {
			lines[i] = dan + " x " + (i+1) + " = " + ((i+1) * dan);
		}
		
		// for 문으로 출력
		for (int i=0; i<lines.length; i++) {
			if ((i+1) % 3 != 0) {
				continue;
			}
			
			System.out.println(lines[i]);
		}
	}
	
}
