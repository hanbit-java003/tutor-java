package com.hanbit.school;

import java.math.BigDecimal;

public class Report {

	private int korean;
	private int english;
	private int math;
	
	public double getAvg() {
		BigDecimal sum = new BigDecimal(String.valueOf(korean + english + math));
		BigDecimal avg = sum.divide(new BigDecimal("3"), 2, BigDecimal.ROUND_HALF_UP);
		
		return avg.doubleValue();
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
	
}
