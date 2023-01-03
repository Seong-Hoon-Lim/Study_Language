package org.java_mentorseries.day02;

public class Variable {

	public static void main(String[] args) {
//		
//		■ 변수 작성 방법의 종류
//		
//		 1) 헝가리안 표기법
//		  : 변수에 자료형을 구분할 수 있는 접두사 달아 표기
//		 2) 카멜 표기법
//		  : 두개이상의 단어가 사용될 경우, 두번째 단어의 시작은 대문자 표기
//		 3) 파스칼 표기법
//		  : Class 명 작성 시, 모든 단어의 첫 글자를 대문자 표기
//		
//		■ 데이터 타입의 종류와 메모리
//		 정수형: int,long,short -> 4,8,2 byte
//		 실수형: float,double -> 4,8 byte
//		 문자형: char -> 2 byte
//		 문자열: String -> 입력값에 따라 byte 달라짐
//		 논리형: boolean -> 1 byte
		
		//정수형 변수
		int i = 100;
		//실수형 변수
		float f = 3.14f;
		double d = 3.14;
		//문자형 변수
		char c = 'c';
		//문자열 변수
		String s = "Hello";
		//논리형 변수
		boolean b = true;
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println(b);
		
		

	}

}
