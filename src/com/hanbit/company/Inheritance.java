package com.hanbit.company;

public class Inheritance {

	public static void main(String[] args) {
		Employee emp = new Employee("001", "김사원");
		Employee manager = new Manager("101", "이과장");
		
		System.out.println(emp.getClass().getSimpleName());
		System.out.println(manager.getClass().getSimpleName());
		
		System.out.println("emp instanceof Object : "
				+ (emp instanceof Object));
		System.out.println("manager instanceof Object : "
				+ (manager instanceof Object));
		System.out.println("emp instanceof Employee : "
				+ (emp instanceof Employee));
		System.out.println("manager instanceof Employee : "
				+ (manager instanceof Employee));
		System.out.println("emp instanceof Manager : "
				+ (emp instanceof Manager));
		System.out.println("manager instanceof Manager : "
				+ (manager instanceof Manager));
	}
	
}
