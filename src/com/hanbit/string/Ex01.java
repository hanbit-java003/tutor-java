package com.hanbit.string;

public class Ex01 {

	public static void main(String[] args) {
		String text = "My name is Peter.";
		text = text.replace(".", "");
		text = text.toLowerCase();
		
		String[] words = text.split(" ");
		
		for (int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
	}
	
}
