package org.java_mentorseries.day02;

public class DataType {

	public static void main(String[] args) {

//		 ■ 형변환
//		
//		 1) 묵시적 형변환(자동 형변환)
//		  : 자동으로 타입이 변환 되는 것
//		 2) 명시적 형변환(강제적 형변환)
//		  : 코드를 이용하여 강제로 타입을 변환시키는 것
//		
		int a = 65;
		float f = a; //묵시적 형변환(자동 형변환)
		System.out.println(f);
		char c = (char)a; //명시적 형변환(강제적 형변환)
		System.out.println(c);

//		■ 변수의 상수화
//		  : 변수에 저장된 값을 변경하지 않고 상수처럼 사용
//		  -> final 자료형 변수명 = 값;
//		 ※ 상수화가 된 변수명은 모든 글자를 대문자로 표기 약속
		
		int i = 3;
		i = 4; // 일반적인 경우에는 변수 값은 재정의 시 변경됨
		
		final double PI = 3.14;
		// PI = 3.15; final로 지정된 변수 값을 재정의 시 오류가 발생
		
		

	}

}
