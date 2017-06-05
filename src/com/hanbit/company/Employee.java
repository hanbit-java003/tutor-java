package com.hanbit.company;

import com.hanbit.Person;
import com.hanbit.job.Job;

public class Employee extends Person implements Job {

	private String empNo;
	private String deptName;
	protected long salary;
	
	public Employee(String empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
	
	protected void fire() {
		System.out.println("짤림");
	}
	
	public String toString() {
		return name + "(" + empNo + ")";
	}
	
	public String getJobType() {
		return getClass().getSimpleName();
	}
	
	public String getEmpNo() {
		return empNo;
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

	@Override
	public String getJobName() {
		return "직원";
	}

}
