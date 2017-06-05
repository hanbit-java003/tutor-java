package com.hanbit.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// ctrl + shift + o (자동 임포트)

public class CollectionApp {

	public static void main(String[] args) {
		learnList();
	}
	
	private static void learnMap() {
		Map map = new HashMap();
		map.put("숫자", 123);
		map.put("문자1", "ABCD");
		map.put("문자2", "ABCD");
		map.put("숫자", 456);
		
		System.out.println(map.get("문자3")); // 없는 key로 호출하면 null
		
		Iterator keys = map.keySet().iterator();

		while (keys.hasNext()) {
			Object key = keys.next();
			Object value = map.get(key);
			
			System.out.println(key + " : " + value);
		}
	}
	
	private static void learnList() {
		List list = new ArrayList();
		
		list.add("Korea");
		list.add("Japan");
		list.add("China");
		list.add("USA");
		list.add(1234);
		list.add("Korea");
		
		// System.out.println(list.get(6)); // 없는 index로 호출하면 Error
		
		for (int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			
			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println("국가명: " + str);
			}
			else {
				System.out.println("문자열이 아닙니다.");
			}
		}
	}
	
}
