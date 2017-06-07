package com.hanbit.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream {
	
	private static String readFile(String path) {
		String contents = "";
		
		FileInputStream input = null;
		byte[] buffer = new byte[1024];
		
		try {
			input = new FileInputStream(path);
			
			while (input.available() > 0) {
				int length = input.read(buffer);
				contents += new String(buffer, 0, length);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		catch (IOException e) {
			System.out.println("읽다가 오류");
		}
		finally {
			try {
				if (input != null) {
					input.close();
				}
			}
			catch (IOException e) {
				System.out.println("닫다가 오류");
			}
		}
		
		return contents;
	}
	
	private static void writeFile(String path, String contents) {
		FileOutputStream output = null;
		
		try {
			output = new FileOutputStream(path);
			output.write(contents.getBytes());
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		catch (IOException e) {
			System.out.println("파일 쓰다가 오류");
		}
		finally {
			try {
				if (output != null) {
					output.close();
				}
			}
			catch (IOException e) {
				System.out.println("파일 닫다가 오류");
			}
		}
	}

	public static void main(String[] args) {
		String path = "C:/hanbit/hello.txt";
		
		writeFile(path, "File Contents");
		
		System.out.println(readFile(path));
	}
	
}
