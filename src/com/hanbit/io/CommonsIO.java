package com.hanbit.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CommonsIO {
	
	private static String readFile(File file) {
		String encoding = "UTF-8";
		
		try {
			return FileUtils.readFileToString(file, encoding);
		}
		catch (IOException e) {
			System.out.println("파일 읽기 오류");
		}
		
		return "";
	}
	
	private static void writeFile(File file, String contents) {
		String encoding = "UTF-8";
		
		try {
			FileUtils.writeStringToFile(file, contents, encoding);
		}
		catch (IOException e) {
			System.out.println("파일 쓰기 오류");
		}
	}

	public static void main(String[] args) {
		File file = new File("C:/hanbit/io.txt");
		
		writeFile(file, "파일내용");
		System.out.println(readFile(file));
	}
	
}
