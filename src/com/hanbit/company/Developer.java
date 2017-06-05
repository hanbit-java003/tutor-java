package com.hanbit.company;

public class Developer extends Employee {
	
	private String langType;

	public Developer(String empNo, String name) {
		super(empNo, name);
	}

	public String getLangType() {
		return langType;
	}

	public void setLangType(String langType) {
		this.langType = langType;
	}
	
	@Override
	public String getJobName() {
		return "개발자";
	}
	
}
