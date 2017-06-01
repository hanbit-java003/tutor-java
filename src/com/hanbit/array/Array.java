package com.hanbit.array;

public class Array {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int[] numbers = {5, 6, 7, 8, 9};
		
		numbers = arr;
		
		arr[0] = 100;
		arr[2] = 54;
		numbers[1] = 77;
		
		System.out.println(arr == numbers);
		
		System.out.println("numbers배열의 길이는: " + numbers.length);
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println("numbers[" + i + "]: " + numbers[i]);
		}
		
		System.out.println("arr배열의 길이는: " + arr.length);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
	}	
}
