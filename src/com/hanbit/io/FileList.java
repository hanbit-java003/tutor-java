package com.hanbit.io;

import java.io.File;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class FileList {

	public static void main(String[] args) {
		String path = "C:/hanbit/java/eclipse";
		
		File file = new File(path);
		
		if (!file.exists() || !file.isDirectory()) {
			return;
		}
		
		System.out.println(" " + file.getAbsolutePath() + " 디렉터리");
		System.out.println();
		
		SimpleDateFormat dateFormat
			= new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		NumberFormat numberFormat = NumberFormat.getInstance();
		
		File[] files = file.listFiles();
		int fileCount = 0;
		int dirCount = 0;
		long fileSizeTotal = 0;
		
		for (File afile : files) {
			if (afile.isHidden()) {
				continue;
			}
			
			Date date = new Date(afile.lastModified());
			System.out.print(dateFormat.format(date) + "\t");
			
			if (afile.isDirectory()) {
				String dir = String.format("%-14s", "<DIR>");
				System.out.print(dir + "\t");
				System.out.println(afile.getName());
				dirCount++;
			}
			else {
				long fileSize = afile.length();
				String size = String.format("%14s", numberFormat.format(fileSize));
				System.out.print(size + "\t");
				System.out.println(afile.getName());
				fileCount++;
				fileSizeTotal += fileSize;
			}
		}
		
		System.out.print(String.format("%,14d", fileCount) + "개 ");
		System.out.print(String.format("%-8s", "파일 "));
		System.out.println(String.format("%,14d", fileSizeTotal) + " 바이트");
		
		System.out.print(String.format("%,14d", dirCount) + "개 ");
		System.out.print(String.format("%-8s", "디렉터리 "));
		System.out.println(String.format("%,14d", file.getFreeSpace()) + " 바이트 남음");
	}
	
}
