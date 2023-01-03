package org.java_mentorseries.day05;

import java.io.StreamCorruptedException;
import java.util.*;


public class Array2 {

	public static void main(String[] args) {
		
//		다차원배열: 배열의 각 요소가 배열
//		2차원 배열의 선언: 자료형[][]배열명;
//		2차원 배열의 생성: 배열명 = new 자료형[크기][크기];
//		 ex) int ar[][] = new int[3][4];
		
//		예문: 5개의 변수를 묶는 1차원 배열 2개를 묶는 2차원 배열 생성
		// 5개의 정수형 변수를 묶는 1차원배열x2 = 2차원배열
//		int ar1[] = new int[5];
//		int ar2[] = new int[5];
		
		// 자료형 배열명[][] = new int[묶음크기][변수갯수];
//		int ar3[][] = new int[2][5];
		
//		2차원 배열의 초기화:
//		 자료형 배열명 [][] = {값1,값2,값3,...},{값4,값5,값6,...}
		
//		예제 1: 4명의 학생의 점수 3개를 입력받아 scores 2차원 배열에 저장 출력
		
//		Scanner sc = new Scanner(System.in);
//		int scores[][] = new int [4][3];
//		String subject[] = {"국어","영어","수학"};
////	2차원 배열을 활용해서 사용자에게 입력받은 값 저장하는 방법
//		for (int j=0; j<4; j++) {
//			System.out.println((j+1)+"번 학생 점수----");
//			for (int i=0; i<3; i++) {
//				System.out.print(subject[i]+":");
//				scores[j][i] = sc.nextInt();
//			}
//		}
////	2차원 배열에 저장된 값을 출력
//		for (int i=0; i<3; i++) {
//			System.out.print("\t"+subject[i]);
//		}
//		System.out.println();
//		for (int j=0; j<4; j++) {
//			System.out.print(j+1+"번:\t");
//			for (int i=0; i<3; i++) {
//				System.out.print(scores[j][i]+"\t");
//			}
//			System.out.println();
//		}
		
//		배열의 복제:
//		  System.arraycopy(src,srcPos,dest,destPost,length);
		
//		  src: 복사할 배열
//		  srcPos: 복사를 하기 시작할 인덱스(위치)
//		  dest: 덮어쓸 배열
//		  destPost: 덮어쓰기 시작할 인덱스(위치)
//		  length: 복사할 길이
		
//		예제 1
		
		int []a = {1,2,3,4,5,6};
		int []b = {0,0,0,0,0,0,0};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 2, b, 3, 4);
		System.out.println(Arrays.toString(b));
//		a 배열의 2번째 인덱스(3)부터 b 배열에 3번째 인덱스에다가 4개를 복제	
		
//		■ for each문
//		  : 배열을 순환할 때, 반복문 보다 편리하게 순환 하도록 사용
//		  -> for(자료형 변수명:배열명) {
//				변수가 배열을 순환하면서 반복할 명령;
//			}
//		
//		예제 1: 3개의 과일을 저장하는 문자열 fruits[] 배열을 만들어서
//			   사용자에게 3개의 과일 이름을 입력받아 fruits 에 저장
//		-> for-each 문을 사용해서 입력받은 과일의 이름을 출력
		
		Scanner sc = new Scanner(System.in);
		String fruits[] = new String[3];
		for (int i=0; i<3; i++) {
			System.out.print("주문할 과일:");
			fruits[i] = sc.next();
		}
		System.out.println("---주문받은 과일---");
		for (String eachFruit:fruits) {
			System.out.print(eachFruit+" ");
		}
		
		

	}

}
