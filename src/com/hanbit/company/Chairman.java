package com.hanbit.company;

public class Chairman extends Executive {

	public Chairman(String empNo, String name) {
		super(empNo, name);
	}

	@Override
	public String getJobName() {
		return "회장";
	}
	
}
