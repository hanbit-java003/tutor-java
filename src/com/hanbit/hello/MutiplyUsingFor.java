package com.hanbit.hello;

public class MutiplyUsingFor {

	public static void main(String[] args) {
		int danStart = 11;
		int danEnd = 19;
		
		int countStart = 11;
		int countEnd = 19;
		
		for (int dan=danStart; dan<=danEnd; dan++) { 
			for (int count=countStart; count<=countEnd; count++) {
				System.out.println(dan + " x " + count + " = " + (dan * count));
			}
		}
	}
	
}
