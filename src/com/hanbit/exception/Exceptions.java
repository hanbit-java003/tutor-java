package com.hanbit.exception;

public class Exceptions {

	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 시작");
		
		try {
			makeException();
		}
		catch (HanbitException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 종료");
	}
	
	private static void makeException() {
		int[] array = new int[3];
		String str = null;
		
		if (true) {
			throw new HanbitException("한빛 익셉션 발생");
		}

		System.out.println(str.length());
		System.out.println(array[3]);
	}
	
}
