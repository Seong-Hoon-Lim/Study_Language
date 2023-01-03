package org.java_mentorseries.day04;

import java.util.Scanner;
import java.util.Random;

public class Condition {

	public static void main(String[] args) {
		
//		■ if 조건문
//		
//		int a = 5;
//		if (true) {
//			System.out.println("항상 참입니다");
//		}
		
//		■ if~else 조건문
		
//		int age = 15;
//		if (age>19) {
//			System.out.println("성인입니다.");
//			System.out.println("성인 요금이 적용됩니다.");
//		}
//		else {
//			System.out.println("청소년입니다.");
//			System.out.println("청소년 요금이 적용됩니다.");
//		}
//		System.out.println("결제를 진행해주세요.");
		
//		■ if~else if 조건문
		
//		Scanner sc = new Scanner(System.in);
//		int age;
//		System.out.print("나이: ");
//		age = sc.nextInt();
//		
//		if (age>19) {
//			System.out.println("성인입니다.");
//			System.out.println("성인 요금이 적용됩니다.");
//		}
//		//13<age<=19
//		else if (age>13) {
//			System.out.println("청소년입니다.");
//			System.out.println("청소년 요금이 적용됩니다.");
//		}
//		//8<age<=13
//		else if (age>8) {
//			System.out.println("어린이 입니다.");
//			System.out.println("어린이 요금이 적용됩니다.");
//		}
//		//age<=8
//		else {
//			System.out.println("유아 입니다.");
//			System.out.println("유아 요금이 적용됩니다.");
//		}
//		System.out.println("결제를 진행해주세요.");
		
//		■ switch 조건문
		
		// 1년 동안 읽은 책 수에 따라 멘트를 출력
		
		int book = 20; //독서량

		switch(book/10) { // 독서량 기준 잘했다 부족하다 판단
		case 0: //10권 미만
			System.out.println("조금 더 노력하세요!");
			break;
		case 1: //10<=book<20
			System.out.println("책 읽는 것을 즐기시는 분이네요!");
			break;
		case 2: //20<=book<30
			System.out.println("책을 사랑하는 분이네요!");
			break;
		default: // 30<=book
			System.out.println("당신은 다독왕입니다!");
		}
		
//		■ Random 클래스
//		 : import java.util.Random 후 사용가능
//		 - Random(): 랜덤 클래스의 객체 생성
//		 - nextInt(): 정수형의 난수를 발생
//		 - nextInt(숫자): 0~숫자~1 까지의 정수형의 난수를 발생
//		 - nextFloat(): 0.0~1.0 까지의 실수형 난수를 발생(0.0과 1.0 미포함)
//		
//		예문 - 포켓몬 선택하기
		
		Random random = new Random(); // 랜덤 클래스의 객체 생성
		System.out.println("☆★☆★Random Choosing Pokemon☆★☆★");
		System.out.println("1. 피카츄: 전기포켓몬");
		System.out.println("2. 꼬부기: 물포켓몬");
		System.out.println("3. 이상해씨: 풀포켓몬");
		
		int mypokemon = random.nextInt(3)+1; //0~2,1~3 난수 발생
		System.out.println("선택된 포켓몬: "+mypokemon);
		
		switch(mypokemon) {
		case 1:
			System.out.println("피카츄 선택! 백만 볼트!!!!");
			break;
		case 2:
			System.out.println("꼬부기 선택! 물대포!!!!");
			break;
		case 3:
			System.out.println("이상해씨 선택! 덩쿨채찍!!!!");
			break;
		}
		
		

	}

}
