package com.hanbit.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextIO {
	
	private static String readFile(File file) {
		String contents = "";
		
		BufferedReader bufferedReader = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader(file);
			bufferedReader = new BufferedReader(reader);
			
			while (bufferedReader.ready()) {
				contents += bufferedReader.readLine() + "\n";
			}
		}
		catch (IOException e) {
			System.out.println("파일 읽기 오류");
		}
		finally {
			try {
				if (reader != null) {
					reader.close();
				}
			}
			catch (IOException e) {
				System.out.println("파일 닫기 오류");
			}
		}
		
		
		return contents;
	}
	
	private static void writeFile(File file, String... lines) {
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(file, false);
			
			for (String line : lines) {
				writer.write(line + "\n");
			}
		}
		catch (IOException e) {
			System.out.println("파일 쓰기 오류");
		}
		finally {
			try {
				if (writer != null) {
					writer.close();
				}
			}
			catch (IOException e) {
				System.out.println("파일 닫기 오류");
			}
		}
	}

	public static void main(String[] args) {
		String dir = "C:/hanbit";
		String fileName = "hello.txt";
		
		String relativePath = "./hello.txt";
		String absolutePath = "C:/hanbit/hello.txt";
		
		File file = new File(absolutePath);
		
		writeFile(file, "abc", "123", "다음줄", "데이터", "aaaa");
		System.out.println(readFile(file));
	}
	
}
