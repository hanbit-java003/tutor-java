package com.hanbit.array;

public class CharArray2 {

	public static void main(String[] args) {
		char[] starbucks = {'s', 't', 'a', 'r', 'b', 'u', 'c', 'k', 's'};
		char except = 's';
		String result = "";
		
		// starbucks 배열에서 except 문자를 빼고 결과 문자열을 완성하세요.
		for (int i=0; i<starbucks.length; i++) {
			if (starbucks[i] == except) {
				continue;
			}
			
			result += starbucks[i];
		}
		
		System.out.println(result); // tarbuck
	}
	
}
