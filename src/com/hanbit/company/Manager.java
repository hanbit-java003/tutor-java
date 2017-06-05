package com.hanbit.company;

public class Manager extends Employee {

	private long bonus;
	
	public Manager(String empNo, String name) {
		super(empNo, name);
	}
	
	public long getSalary() {
		return salary + bonus;
	}

	public long getBonus() {
		return bonus;
	}

	public void setBonus(long bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String getJobName() {
		return "관리자";
	}
	
}
