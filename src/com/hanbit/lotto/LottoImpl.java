package com.hanbit.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoImpl implements Lotto {

	public List<Integer> getLottoNums() {
		// 서로 다른 6개의 값을 받아 리스트로 반환
		List<Integer> list = new ArrayList<>();
		
		for (int i=0; i<6; i++) {
			int nextNum = getNextNum();
			
			while (list.contains(nextNum)) {
				nextNum = getNextNum();
			}
			
			list.add(nextNum);
		}
		
		return list;
	}
	
	private int getNextNum() {
		// 1 ~ 45 사이의 랜덤값
		Random random = new Random();
		return random.nextInt(45) + 1;
	}
	
}
