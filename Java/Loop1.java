package org.java_mentorseries.day04;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {

//		※ 반복문이 없을 때 이렇게 직접 적어야 함
//		1번~10번 까지 컴퓨터를 켜달라는 명령을 하면?		
//		System.out.println("1번 컴퓨터 켜줘");
//		System.out.println("2번 컴퓨터 켜줘");
//		System.out.println("3번 컴퓨터 켜줘");
//		.
//		.
//		.
//		System.out.println("10번 컴퓨터 켜줘");

//		■ for 문: 특정 횟수 동안 작업을 반복하고 싶을 때 사용
//		1번~10번 까지 컴퓨터를 켜달라는 명령을 하면?

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i + "번 컴퓨터 켜줘");
//		}

//		1번~10번 까지 컴퓨터를 켜달라는 명령을 반대로 하면?
//		for (int i = 10; i >= 1; i--) {
//			System.out.println(i + "번 컴퓨터 켜줘");
//		}

//		 1번부터 시작해서 10번보다 작거나 같을 때 까지 컴퓨터를 켜주고 1씩 증가하면서
//		 짝수번호만 켜달라는 명령을 하면?
		
//		for (int i=1; i<=10; i++) {
//			if (i%2==0) { // i%2==0 짝수
//				System.out.println(i+ "번 컴퓨터 켜줘");
//			}
//		}
		
//		i가 증가되는 만큼 그 값을 더한 sum의 값을 출력
		
//		int sum = 0;
//		for (int i=1; i<=10; i++) {
//			System.out.printf("i=%d, sum=%d\n", i,sum+=i);
//		}
		
//		1~10 까지의 합을 계산해서 출력
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		
				 
	}

}
