package com.hanbit.lotto;

import java.util.List;

public class LottoApp {

	public static void main(String[] args) {
		Lotto lotto = new LottoImpl();
		List<Integer> nums = lotto.getLottoNums();
		
		System.out.println(nums);
	}
	
}
