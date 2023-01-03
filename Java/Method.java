package org.java_mentorseries.day05;

import java.awt.Taskbar.State;


//		■ 메서드 정의
//		 : 여러 명령들의 나열된 묶음
//		   입력 값을 받아서 내부에서 처리 후 결과를 출력 또는 반환 역할
//		 -> 멤버 함수(member function)라고도 불리며, 클래스 내부에서 생성
//		 -> 여러 명령들을 하나의 이름을 호출(사용)함으로써, 한번에 명령을 실행
//		 메서드 구조 <호출부>
//		  : 메서드명(값1,값2...); 
//		   ※ 반드시 main 안에서 호출 되어야함.
//		 메서드 구조 <구현부>
//		  : 반환타입 메서드명(타입 변수명, 타입 변수명) {
//					명령1;
//					명령2;
//					return 값;
//		

//		예문

public class Method {
//		
//	public static void main(String[] args) {
//		open();
//	}
//		static void open() {
//			System.out.println("문을열기");
//			System.out.println("바닥청소");
//			System.out.println("포스기on");
//			System.out.println("빵을진열");
//		}
		
//		예제1: 함수를 호출 할 때 100 이라는 값을 구현부에 전달 하고
//		함수의 구현부에서 전달받은 값을 출력하라
		
	
//	public static void main(String[] args) {
//			f1(100);
//	}
//	
//	static void f1(int x) { // 함수 호출시 100을 전달받아서, 전달받은 100 출력
//		System.out.println("x:"+x);
//	}
		
//	public static void main(String[] args) {
//		System.out.println(f());
//	}
//	static int f() {
//		System.out.println("f() 호출!");
//		return 100;
//	}
	
//	예제1: 사각의형의 넓이를 구하라
	
	public static void main(String[] args) {
		System.out.println("사각형의 넓이:"+colculator(10,20));
	}
	
	static int colculator(int a, int b) {
		System.out.println("<계산을 시작합니다>");
		int area = a*b;
		return area;
	}
	
	
		
		
}