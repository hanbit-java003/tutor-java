package com.hanbit.syntax;

public class Arrays {

	byte[] bytes;
	short[] shorts;
	int[] ints = new int[5];
	long[] longs;
	float[] floats;
	double[] doubles;
	boolean[] booleans;
	char[] chars = {'a', 'b', 'c', 'd'};
	
	String[] strings = {new String("abc"), "hello"};
	System[] systems = new System[4];
	
	void desc() {
		// 배열의 길이
		int lengthOfInts = ints.length;
		int lengthOfStrings = strings.length;
		
		// 배열 값 설정
		ints[0] = 3;
		ints[1] = 2;
		strings[1] = new String("java");
		
		// 배열 값 사용
		int number = ints[0];
		int result = 5 + ints[1];
		String upper = strings[1].toUpperCase();
	}
	
}
