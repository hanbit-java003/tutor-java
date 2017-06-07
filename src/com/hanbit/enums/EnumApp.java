package com.hanbit.enums;

public class EnumApp {

	public static void main(String[] args) {
		setSize(Size.SMALL);
	}
	
	private static void setSize(Size size) {
		System.out.println(size);
		System.out.println(size.getAlias());
	}
	
}
