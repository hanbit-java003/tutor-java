package com.hanbit.string;

public class SplitAndJoin {

	public static void main(String[] args) {
		String nationalCodes = "KR,JP,CN,US";
		
		String[] codes = nationalCodes.split(",");
		
		for (int i=0; i<codes.length; i++) {
			System.out.println(codes[i]);
		}
		
		String joinCodes = String.join(":", codes);
		
		System.out.println(joinCodes);
	}
	
}
