package org.java_mentorseries.day05;

//	■ 메서드 오버로딩: 오버로딩(Overloading)은 매개변수의 개수와 타입은 다르지만
//				   이름이 같은 메서드를 여러 개 정의하는 것
//	  오버로딩: 메서드 중복정의
//	   -> 일반적으로 메서드 사용시, 메서드명을 구분해서 사용
//	   -> 같은 기능을 갖고 있는 메서드 경우 매번 이름을 정의하는 것이 불가할 때 사용
//

//	예제1: 정수형 값을 두 개 전달받아 두 수의 합을 출력하는 메서드 구현
//	    : 실수형 값을 두 개 전달받아 두 수의 합을 출력하는 메서드 구현


public class MethodOverloading {
//
//	public static void main(String[] args) {
////		sumInt(10,20); // 오버로딩 하지 않았을 때
////		sumDouble(1.23,3.12); // 오버로딩 하지 않았을 때
//		sum(10,20);
//		sum(1.23,3.12);
//		sum(10,20,30);
//	}	
//	// 메서드의 매개변수 타입의 변환하여 오버로딩
////	static void sumInt(int x, int y) { // 오버로딩 하지 않았을 때
//	static void sum(int x, int y) { // 오버로딩 했을 때
//		System.out.println(x+y);
//	}
////	static void sumDouble(double x, double y) { // 오버로딩 하지 않았을 때
//	static void sum(double x, double y) { // 오버로딩 했을 때
//		System.out.println(x+y);
//	}
//	// 메서드의 매개변수 갯수를 변환하여 오버로딩
//	static void sum(int x, int y, int z) {
//		System.out.println(x+y+z);
//	}
	
//	 예제2: 두 수를 전달받아, 두 수의 +,-,*,/ 를 계산하는 메서드를 만들어라.
//	       단, 입력 받은 수는 정수,실수 모두 가능!
	
	public static void main(String[] args) {
		System.out.println("--정수의 사칙연산--");
		System.out.println("sum(10,20):"+sum(10,20));
		System.out.println("sub(10,20):"+sub(10,20));
		System.out.println("mul(10,20):"+mul(10,20));
		System.out.println("div(10,20):"+div(10,20));
		System.out.println("--실수의 사칙연산--");
		System.out.println("sum(1.2,2.3):"+sum(1.2,2.3));
		System.out.println("sub(1.2,2.3):"+sub(1.2,2.3));
		System.out.println("mul(1.2,2.3):"+mul(1.2,2.3));
		System.out.println("div(1.2,2.3):"+div(1.2,2.3));
		System.out.println("--문자열의 덧셈연산--");
		System.out.println("sum(hello,java):"+sum("hello","java"));
	}
	//정수형의 사칙연산
	static int sum(int x, int y) {return x+y;}
	static int sub(int x, int y) {return x-y;}
	static int mul(int x, int y) {return x*y;}
	static int div(int x, int y) {return x/y;}
	
	//실수형의 사칙연산
	static double sum(double x, double y) {return x+y;}
	static double sub(double x, double y) {return x-y;}
	static double mul(double x, double y) {return x*y;}
	static double div(double x, double y) {return x/y;}
	
	//문자열의 덧셈연산
	static String sum(String x, String y) {return x+y;}
	
	
	
	
}
