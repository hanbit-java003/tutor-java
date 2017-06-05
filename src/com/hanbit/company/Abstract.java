package com.hanbit.company;

import com.hanbit.job.Job;

public class Abstract {

	public static void main(String[] args) {
		Employee emp = new Employee("001", "김사원");
		Developer dev = new Developer("011", "나개발");
		Chairman cm = new Chairman("501", "최회장");
		
		printInfo(dev);
		printInfo(cm);
	}
	
	private static void printInfo(Job job) {
		System.out.println(job);
		System.out.println("직업명: " + job.getJobName());
		
		if (job instanceof Manager) {
			Manager mgr = (Manager) job; // 형변환 (Type Casting)
			System.out.println("보너스: " + mgr.getBonus());
		}
	}
	
}
