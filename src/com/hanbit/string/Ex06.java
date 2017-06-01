package com.hanbit.string;

public class Ex06 {

	public static void main(String[] args) {
		String[] names = {"Peter Kim", "Mike Choi", "Hansel E Park"};
		
		String template = "My name is {firstName} {lastName}.\n" + 
				"First name is {firstName}, last name is {lastName}.";
		
		for (int i=0; i<names.length; i++) {
			String name = names[i];
			
			String[] temp = name.split(" ");
			
			String firstName = temp[0];
			String lastName = temp[temp.length - 1];
			
			String text = template.replace("{firstName}", firstName);
			text = text.replace("{lastName}", lastName);
			text = text.replace("{fullName}", name);
			
			System.out.println(text);
		}
	}
	
}
