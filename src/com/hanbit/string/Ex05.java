package com.hanbit.string;

public class Ex05 {

	public static void main(String[] args) {
		// 024561234 : 02-456-1234
		// 0231004567 : 02-3100-4567
		// 0312352245 : 031-235-2245
		// 01088771234 : 010-8877-1234
		// 0112245678 : 011-224-5678
		String[] telNos = {"024561234", "0231004567", "0312352245",
				"01088771234", "0112245678"};
		
		for (int i=0; i<telNos.length; i++) {
			String telNo = telNos[i];

			String firstNumber = telNo.substring(0, telNo.length() - 4);
			String localNo = "";
			String exchangeNo = "";
			
			if (firstNumber.startsWith("02")) {
				localNo = "02";
				exchangeNo = firstNumber.substring(2);
			}
			else {
				localNo = firstNumber.substring(0, 3);
				exchangeNo = firstNumber.substring(3);
			}
			
			String lastNumber = telNo.substring(telNo.length() - 4);
			
			String telNumber = String.join("-", localNo, exchangeNo, lastNumber);
			System.out.println(telNumber);
		}
		
	}
	
}
