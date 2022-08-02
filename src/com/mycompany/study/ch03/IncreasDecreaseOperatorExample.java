package com.mycompany.study.ch03;

public class IncreasDecreaseOperatorExample {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		i++;
		++j;
		System.out.println("i :" + i + ", j :" + j);

		int a = 1;
		int b = 1;
		
		--a;
		b--;
		System.out.println("a: " + a + ", b: " + b);
		
		int k = i++;
		System.out.println("k: " + k + ", i: " + i);
		
		int m = ++j;
		System.out.println("m: " + m + ", j: " + j);

		int z= ++i + j++;
		System.out.println("i: " + i + ", j: " + j +", z: " + z);
	}

}
