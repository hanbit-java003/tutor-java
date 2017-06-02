package com.hanbit.syntax;

// 내부 클래스
public class NestedClass {

	public class Inner {
		
	}
	
	private class InnerClass {
		
	}
	
	public static class StaticNestedClass {
		
	}
	
	void desc() {
		NestedClass.Inner inner = new NestedClass.Inner();
	}
	
}
