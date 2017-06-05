package com.hanbit.company;

public class Overriding {

	public static void main(String[] args) {
		Employee emp = new Employee("001", "김사원");
		emp.setSalary(3000);
		
		Manager mgr = new Manager("101", "이과장");
		mgr.setSalary(5000);
		mgr.setBonus(500);
		
		Executive ceo = new Executive("201", "박사장");
		ceo.setSalary(10000);
		ceo.setBonus(5000);
		
		System.out.println(emp.getJobType());
		System.out.println(emp + " 연봉: " + emp.getSalary());
		System.out.println(mgr.getJobType());
		System.out.println(mgr + " 연봉: " + mgr.getSalary());
		System.out.println(ceo.getJobType());
		System.out.println(ceo + " 연봉: " + ceo.getSalary());
	}
	
}
