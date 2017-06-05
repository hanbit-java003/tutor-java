package com.hanbit.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generic {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abcd");
		list.add("Hello");
		
		Map<String, Integer> map = new HashMap<>();
		map.put("1st", 1);
		map.put("2nd", 2);
		map.put("3rd", 3);
		
		int value = map.get("2nd");
	}
	
}
