package com.hanbit.school;

public class SchoolApp {

	public static void main(String[] args) {
		Student student1 = new Student("김한빛", 1, 3, 15);
		Student student2 = new Student("원어민", 2, 4, 7);
		
		student1.setStudentNo("020514");
		
		student1.getReport().setReport(95, 74, 66, 85);
		student1.getReport().setReport("95,74,66,85");
		
		student2.getReport().setReport(student1.getReport());
		student2.getReport().setMath(73);
		
		printStudent(student1);
	}
	
	private static void printStudent(Student student) {
		System.out.println("====학생정보====");
		System.out.println("이름 = " + student.getName());
		System.out.println("학년 = " + student.getGrade());
		System.out.println("반 = " + student.getClassNo());
		System.out.println("번호 = " + student.getNo());
		System.out.println("학번 = " + student.getStudentNo());
		
		printReport(student.getReport());
	}
	
	private static void printReport(Report report) {
		System.out.println("----성적----");
		System.out.println("국어 = " + report.getKorean() + "점");
		System.out.println("영어 = " + report.getEnglish() + "점");
		System.out.println("수학 = " + report.getMath() + "점");
		System.out.println("과학 = " + report.getScience() + "점");
		System.out.println("------------");
		System.out.println("평균 = " + report.getAvg() + "점");
	}
	
}







