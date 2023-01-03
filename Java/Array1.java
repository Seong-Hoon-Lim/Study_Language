package org.java_mentorseries.day05;

import java.io.StreamCorruptedException;
import java.util.*;

public class Array1 {

	public static void main(String[] args) {
		
//		■ 배열: 같은 자료형 변수들의 나열된 묶음
//		 -> 같은 타입의 변수들의 관리를 편하게 하기 위해서 활용
//		
//		 배열을 선언
//		  1) 타입[] 배열명; -> int[] ar;
//		  2) 배열명=new타입[길이]; -> ar=new int[3];
//		  실제 사용하게 되면 -> int[] ar = new int[3];
//		
//		 배열의 사용: 생성 시 배열의 타입에 해당하는 기본값으로 초기화
//		  1) 정수형 배열의 초기값: 0
//		  2) 문자형 배열의 초기값: ' '
//		  3) 실수형 배열의 초기값: 0.0
//		  4) 문자열 배열의 초기값: Null
		
//		예제 1
		// 3명의 학생 점수를 저장 100점,80점,70점
		int score1 = 100;
		int score2 = 80;
		int score3 = 70;
		
//		System.out.println("1 번째 학생의 점수:"+score1+"점");
//		System.out.println("2 번째 학생의 점수:"+score2+"점");
//		System.out.println("3 번째 학생의 점수:"+score3+"점");
		
		int scores[] = new int[3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		
		for (int i=0; i<3; i++) {
			System.out.println(i+1+" 번째 학생의 점수:"+scores[i]+"점");
		}
		
//		예제 2 (배열의 초기값 확인)
		
		int arInt[] = new int[3];
		double arDouble[] = new double[3];
		char arChar[] = new char[3];
		String arString[] = new String[3];
		
		for (int i=0; i<3; i++) {
			System.out.print(arInt[i]+ " ");
		}
		System.out.println();
		for (int i=0; i<3; i++) {
			System.out.print(arDouble[i]+ " ");
		}
		System.out.println();
		for (int i=0; i<3; i++) {
			System.out.print(arChar[i]+ " ");
		}
		System.out.println();
		for (int i=0; i<3; i++) {
			System.out.print(arString[i]+ " ");
		}
		System.out.println();
		
//		 배열의 길이 구하기: 배열명.length
//		 배열의 요소를 문자열로 출력하기: Arrays.toString(배열명)
//		   ※ import java.util.Arrays; 를 해야 사용가능.
		
//		예제 3
		
//		a라는 정수형 배열을 생성할 때, 바로 초기값을 넣는 방법
		int[] a = new int[] {10,20,4,25,18};
//		b라는 정수형 배열을 생성할 때, 초기값으로 넣는 방법(new int[] 생략가능)
		int[] b = {1,2,3,4,5,6,7};
//		c라는 정수형 배열을 선언하고, 10개의 정수를 묶을 수 있는 크기를 할당
		int c[] = new int[10];
//		배열.length: 배열의 길이, 배열의 요소 갯수
		for (int i=0; i<c.length; i++) {
			c[i]=i;
		}
		for (int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(c));
		
//		예제 4
		
		int []students = {100,95,90,88,93};
		int sum = 0;
		for (int i=0; i<students.length; i++) {
			sum+=students[i];
		}
		//정수/정수=정수, 실수값이 나와야 하므로, 정수/실수 가 되도록 형변환
		System.out.println("시험 점수의 평균:"+sum/(float)students.length);
		
		
		

	}

}
