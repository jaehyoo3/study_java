package com.mycompany.study.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		int[] arr2;
		arr2 = new int[3];
		
		arr1[0] = 77;
		arr1[1] = 37;
		arr1[2] = 63;
		
		System.out.println("arr1[0]: " + arr1[0] + ", arr1[1]: " + arr1[1] + ", arr1[2]: " + arr1[2]);

	}

}
