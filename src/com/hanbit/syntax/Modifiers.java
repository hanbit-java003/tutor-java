package com.hanbit.syntax;

// 접근지시자, 접근제한자
public class Modifiers {

	// 1. Access Modifiers
	// 1-1. public
	public int num; // 어떤 패키지, 어떤 클래스에서도 접근 가능
	
	// 1-2. private
	private String name; // 현재 클래스만 접근 가능
	
	// 1-3. (default)
	boolean result; // 현재 패키지내 클래스에서 접근 가능
	
	// 1-4. protected
	protected long price; // 현재 클래스를 상속한 클래스, 현재 패키지내 클래스에서 접근 가능
	
	// 2. Static Modifier
	public static int count; // 객체(instance)를 만들지 않고 사용 가능
	
	// 3. Final Modifier
	// 선언시 초기화하거나, 생성자에서 반드시 초기화 하여야 함
	// 초기화 이후 변경 불가능 => 상수 (Constants)
	private static final double PI = 3.14; 
	public final String NAME_OF_KOREA;
	
	public Modifiers() {
		NAME_OF_KOREA = "대한민국";
	}
	
}
