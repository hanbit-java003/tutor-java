package com.hanbit.string;

public class Ex03 {

	public static void main(String[] args) {
		String dateTime = "2017/05/29 15:38:45";
		
		String[] temp = dateTime.split(" ");
		String date = temp[0];
		String time = temp[1];
		
		temp = date.split("/");
		
		String year = temp[0];
		String month = temp[1];
		String day = temp[2];
		
		temp = time.split(":");
		
		String hour = temp[0];
		String minute = temp[1];
		String second = temp[2];
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
	
}
