package com.hanbit.enums;

public enum Size { // Enumeration

	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("XL");
	
	private String alias;
	
	private Size(String alias) {
		this.alias = alias;
	}
	
	public String getAlias() {
		return alias;
	}
	
}
