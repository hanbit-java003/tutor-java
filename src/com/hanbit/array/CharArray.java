package com.hanbit.array;

public class CharArray {
	
	public static void main(String[] args) {
		char[] text = {'H', 'e', 'l', 'l', 'o'};
		char searchCh = 'l';
		
		// searchCh 이 앞에서부터 몇번째 인덱스인지 출력하시오.
		for (int i=0; i<text.length; i++) {
			if (text[i] == searchCh) {
				System.out.println("index: " + i);
				break;
			}
		}
		
		// searchCh 이 뒤에서부터 몇번째 인덱스인지 출력하시오.
		for (int i=text.length-1, j=0; i>=0; i--, j++) {
			if (text[i] == searchCh) {
				System.out.println("index: " + j);
				break;
			}
		}
	}
	
}
