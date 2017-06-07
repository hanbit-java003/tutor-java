package com.hanbit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CodeStyle {
	
	public static String str;
	private int count;
	public static final int MAX_LENGTH = 5;
	
	protected static void method(String name, int num) {
		List<String> list = new ArrayList<>();
		IOException exception;
		HashMap<String, String> hashMap = new HashMap<>();
	}
	
	private String getString() throws Exception {
		return null;
	}
	
	public static void main(String[] args) {
		int num = 4;
		String name = "Java";
		
		if (num < 5) {
			System.out.println("abc");
			System.out.println("123");
		}
		else if (num > 5) {
			
		}
		else {
			
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		while ("Hello".equals(name)) {
			
		}
		
		do {
			
		}
		while ("Hello".equals(name));
		
		switch (num) {
			case 1: {
				System.out.println("a");
				System.out.println("b");
			}
			case 2: {
				
			}
			case 3: {
				
			}
			default: {
				
			}
		}
		
		try {
			
		}
		catch (Exception e) {
			
		}
		finally {
			
		}
	}
	
}










