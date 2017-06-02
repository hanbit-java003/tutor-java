package com.hanbit.school;

public class Student {

	// 멤버 속성
	private String name;
	private int grade;
	private int classNo;
	private int no;
	
	private Report report;
	
	// 생성자
	public Student(String name, int grade, int classNo, int no) {
		this.name = name;
		this.grade = grade;
		this.classNo = classNo;
		this.no = no;
		
		report = new Report();
	}
	
	// 멤버 메소드
	public Report getReport() {
		return report;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getClassNo() {
		return classNo;
	}
	
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}

	public String getStudentNo() {
		String studentNo = "";
		
		studentNo += String.format("%02d", grade);
		studentNo += String.format("%02d", classNo);
		studentNo += String.format("%02d", no);
		
		return studentNo;
	}
	
}





