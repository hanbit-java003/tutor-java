package com.hanbit.io;

import java.util.Scanner;

public class SystemInput {

	public static void main(String[] args) {
		System.out.print("이름을 입력하세요:");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		
		System.out.println(name + "을 입력했습니다.");
	}
	
}
