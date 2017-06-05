package com.hanbit.company;

import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class CompanyApp {

	public static void main(String[] args) {
		Stack<Employee> stack = new Stack<>();
		Employee emp = new Employee("001", "김사원");
		Manager mgr = new Manager("101", "이과장");
		Executive ceo = new Executive("401", "박사장");
		
		stack.push(emp);
		stack.push(mgr);
		stack.push(ceo);
		
		Employee someone = stack.pop();
		System.out.println(someone.getName());
		someone = stack.pop();
		System.out.println(someone.getName());
		someone = stack.pop();
		System.out.println(someone.getName());
	}
	
}
