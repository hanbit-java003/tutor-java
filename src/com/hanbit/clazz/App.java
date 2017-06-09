package com.hanbit.clazz;

public class App {
	
	public static void main(String[] args) {
		System.out.println("회원수: " + Member.getMemberCount());
		
		Member member1 = new Member("hanbit");
		member1.setPassword("1234");
		member1.setEmail("hanbit@hanbit.com");
		
		System.out.println("회원수: " + Member.getMemberCount());

		Member member2 = new Member("hanbit");
		member2.setPassword("abcd");
		
		System.out.println("회원수: " + Member.getMemberCount());
		
		System.out.println("회원1: " + member1.getId());
		System.out.println("회원2: " + member2.getId());
		System.out.println("회원2: " + member2.getId());
	}
	
}
