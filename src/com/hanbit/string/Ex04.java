package com.hanbit.string;

public class Ex04 {

	public static void main(String[] args) {
		String date = "2017년05월31일";
		
		int indexYear = date.indexOf("년");
		int indexMonth = date.indexOf("월");
		int indexDay = date.indexOf("일");
		
		String year = date.substring(0, indexYear);
		String month = date.substring(indexYear+1, indexMonth);
		String day = date.substring(indexMonth+1, indexDay);
		
		String convertedDate = String.join("/", year, month, day);
		
		System.out.println(convertedDate); // 2017/05/31
	}
	
}
