package org.java_mentorseries.day04;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		
//		■ while 문: 조건이 true 일 동안 ~명령을 반복할 때 사용
		
//		int x = 1;
//		while (x <=10) {
//			System.out.println("x: "+x);
//			x++;
//		}
		
//		while 문 예제
//		사용자에게 입력받은 값이 Y라면, 음악재생을 반복하고
//		아니라면 반복을 멈추세요
		
//		Scanner sc = new Scanner(System.in);
//		String answer = "Y"; //answer 값을 Y로 초기화해야 while 실행가능
//		int count = 0;
//		while (answer.equals("Y")) {
//			System.out.println("음악을 재생하시겠습니까?(Y)");
//			answer = sc.nextLine();
//			if (answer.equals("Y")) {
//				System.out.printf("음악을 %d번 재생하였습니다.\n", ++count);
//			}
//		}
//		System.out.println("재생 종료");
//		
////		■ do-while 문: 일단 한번은 실행하고, 조건이 true면 명령을 반복할 때 사용
//		
//		int i = 100;
//		do {
//			System.out.println("적어도 한번은 출력되는 문장");
//		}
//		while (i > 10);
//		System.out.println("프로그램 종료");
		
//		■ break 문: 즉시 반복을 멈출 때
		
//		예제 1
//		Scanner sc = new Scanner(System.in);
//		int i;
//		while (true ) {
//			System.out.print("숫자입력");
//			i = sc.nextInt();
//			if (i==0) {
//				System.out.println("반복을 멈춥니다.");
//				break;
//			}
//			System.out.println("i: "+i);
//		}
		
//		예제 2
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int i;
//		while (true) {
//			System.out.println("더할 숫자를 입력하세요:(종료하려면 0입력)");
//			i = sc.nextInt();
//			if (i==0) {
//				break;
//			}
//			sum+=i;
//		}
//		System.out.println("현재까지의 총 합="+sum);
		
//		■ continue문: 아래 명령은 무시하고, 다음 반복을 실행
		
//		예제 1
		 
//		Scanner sc = new Scanner(System.in);
//		int i;
//		while (true) {
//			System.out.print("숫자입력: ");
//			i = sc.nextInt();
//			if (i==0) {
//				System.out.println("종료");
//				break;
//			}
//			else if (i<0) {
//				System.out.println("아래 명령 무시하고 반복진행");
//				continue;
//			}
//			System.out.println("i: "+i);
//		}
		
//		예제 2
		
		int money = 10000;
		System.out.println("현재 가진돈은 10,000원 입니다.");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("얼마를 사용하시겠습니까?");
			int i = sc.nextInt();
			if (!(0<=i&&i<=money)) {
				System.out.println("다시 입력해주세요(사용범위가 틀렸습니다!)");
				continue;
			}
			System.out.printf("이제%d원이 남았습니다.\n", money-=i);
			if (money==0) {
				break;
			}
		}
		System.out.println("모든 돈을 사용합니다. 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
