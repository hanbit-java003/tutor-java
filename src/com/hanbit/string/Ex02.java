package com.hanbit.string;

public class Ex02 {

	public static void main(String[] args) {
		String address = "http://www.naver.com?id=hanbit";
		
		int index = address.indexOf("/") + 2;
		int indexQs = address.indexOf("?");
		
		String protocol = address.substring(0, index);
		String domain = address.substring(index, indexQs);
		String queryString = address.substring(indexQs);
		
		System.out.println("프로토콜: " + protocol);
		System.out.println("도메인: " + domain);
		System.out.println("쿼리스트링: " + queryString);
	}
	
}
