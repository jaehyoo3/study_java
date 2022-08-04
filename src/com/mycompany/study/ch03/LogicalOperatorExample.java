package com.mycompany.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

//		&&, & =and 논리곱 : 연산 참참참, 나머지 false
//		||, | = or  논리합 : 연산 참 false 참 / false 참 참 , 참참참 , false false false
// 		^ : 베타적 논리합: 참참 거짓 / 거짓거짓 거짓 / 거짓참 참
		int a = 65;
		
		boolean result = (a>= 65);
		boolean result2 = (a<= 65);
		System.out.println(result);
		System.out.println(result2);
		if(a>= 65 & a <= 90) {
			System.out.println("65보다 크거나 90보다 작습니다");
		}
		if(a>= 65 && a <= 90) {
			System.out.println("65보다 크거나 90보다 작습니다");
		}
		System.out.println("-----------------------");
		if(a>=65 | a<=90) {
			System.out.println("둘다 참");	
		}
		if(a>=66 | a<=90) {
			System.out.println("하나만 참");
		}
		if(a>=66 | a<=50) {
			System.out.println("둘다 거짓");
		}
		if(a>=65 | a<=50) {
			System.out.println("하나만 참");
		}
		System.out.println("------------------");
		if(a>=65 ^ a<=90) {
			System.out.println("둘다 참");	
		}
		if(a>=66 ^ a<=90) {
			System.out.println("하나만 참");
		}
		if(a>=66 ^ a<=50) {
			System.out.println("둘다 거짓");
		}
		if(a>=65 ^ a<=50) {
			System.out.println("하나만 참");
		}

	}
}