package com.hanbit.company;

public class Executive extends Manager {

	public Executive(String empNo, String name) {
		super(empNo, name);
	}

	protected final void fire() {
		System.out.println("못자름");
	}
	
	@Override
	public String getJobName() {
		return "임원";
	}
	
}
