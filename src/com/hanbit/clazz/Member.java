package com.hanbit.clazz;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private static List<String> ids = new ArrayList<>();
	
	public static int getMemberCount() {
		return ids.size();
	}

	private String id;
	private String password;
	private String email;
	private int point;
	
	private boolean loggedIn;
	
	public Member(String id) { // 생성자 오버로딩 (overloading)
		if (ids.contains(id)) {
			id += "1";
		}
		
		ids.add(id);
		
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean login(String id, String password) {
		if (!this.id.equals(id)) {
			return false;
		}
		
		if (!this.password.equals(password)) {
			return false;
		}
		
		loggedIn = true;
		
		return true;
	}
	
	private boolean isLoggedIn() {
		if (!loggedIn) {
			System.out.println("로그인이 필요합니다.");
		}		
		
		return loggedIn;
	}
	
	public int getPoint() {
		if (!isLoggedIn()) {
			return -1;
		}
		
		return point;
	}
	
}










