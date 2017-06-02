package com.hanbit.school;

import java.math.BigDecimal;

public class Report {

	private int korean;
	private int english;
	private int math;
	private int science;
	
	public double getAvg() {
		BigDecimal sum = new BigDecimal(
				String.valueOf(korean + english + math + science));
		BigDecimal avg = sum.divide(new BigDecimal("4"), 2, BigDecimal.ROUND_HALF_UP);
		
		return avg.doubleValue();
	}
	
	public void setReport(Report report) {
		setReport(report.getKorean(), report.getEnglish(),
				report.getMath(), report.getScience());
	}
	
	public void setReport(String report) {
		String[] scores = report.split(",");
		
		korean = Integer.valueOf(scores[0]);
		english = Integer.valueOf(scores[1]);
		math = Integer.valueOf(scores[2]);
		science = Integer.valueOf(scores[3]);
	}
	
	public void setReport(int korean, int english, int math, int science) {
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public int getKorean() {
		return korean;
	}
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}	
	
}
