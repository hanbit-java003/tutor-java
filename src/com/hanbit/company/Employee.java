package com.hanbit.company;

public class Employee {

	private String empNo;
	private String name;
	private String deptName;
	private long salary;
	
	public Employee(String empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
	
	public String getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}
	
	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
