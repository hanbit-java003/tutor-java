package com.hanbit.hello;

public class Mutiply {

	public static void main(String[] args) {
		int dan = 4;
		int count = 0;
		
		do {
			System.out.println(dan + " x " + count + " = " + (dan * count));
			count += 1;
		} while (count >= 1 && count <= 9);
	}
	
}
