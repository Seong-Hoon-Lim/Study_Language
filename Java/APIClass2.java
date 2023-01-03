package org.java_mentorseries.day09;

import java.util.Random;
import java.util.random.*;

//	 ■ Wrapper 클래스: 기본 자료형들을 객체로 다루는데 사용
//		-> 일반 자료형 데이터를 객체로 변환하는 작업 때 주로 사용
//		ex) int 자료형 -> Integer 클래스
//		    char 자료형 -> Character 클래스
//	   Wrapper 클래스 생성 방법
//		<구조>
//	   Wrapper 클래스명 객체명 = new Wrapper 클래스명(값);
//		ex) Integer i = new Integer(3);
//			Double d = new Double(3.14);
//		※ Jdk 9 버전 이후부터는 Wrapper 클래스의 생성자 사용을 권장하지 않는다.
//		ex) Integer i = 3; auto boxing 식으로 사용
//
//	 ■ 오토박싱(Auto Boxing)
//	  : 기본 자료형 값을 자동으로 Wrapper 클래스의 객체로 변환시켜 주는 것
//
//	 ■ 오토 언박싱(Auto Unboxing)
//	  : Wrapper 클래스의 객체 값을 자동으로 기본 자료형 값으로 변환시켜 주는 것
//
//	 ■ Random 클래스: 무작위의 값을 얻고 싶을 때 사용하는 클래스
//		- Random 클래스는 내부적으로 무작위의 값을 추출하기 위한 알고리즘이 존재
//		- 생성방법 -> Random 객체명 = new Random();
//		- 생성자 종류
//		 > Random(): 현재 시간을 seed 값으로 인스턴스 생성
//		 > Random(int seed): 받아오는 seed 값으로 인스턴스 생성 -> 값도 같아짐
//	 ■ Random 클래스 메서드
//	   int nextInt(): 무작위의 int 값을 반환
//	   int nextInt(int n): 0보다 크고 n보다 작은 int 값을 반환
//	   int nextBoolean(): 무작위의 boolean 값을 반환
//	   int nextLong(): 무작위의 long 값을 반환
//	   int nextDouble(): 무작위의 double 값을 반환
//	   int nextFloat(): 무작위의 float 값을 반환
//

public class APIClass2 {

//	Wrapper 클래스 예문
	
//	public static void main(String[] args) {
//		int i = 30;
//		Integer ii = new Integer(i); //권장하지 않는다는 표시
//		System.out.println(ii);
//		
//		double d = 3.14;
//		Double dd = new Double(d); //권장하지 않는다는 표시
//		System.out.println(dd);
//	}
//
//}

// IntegerWrapper 클래스 메소드 예문

//	public static void main(String[] args) {
//		Integer ii = 30; //auto boxing
//		//Integer -> int
//		System.out.println(ii.intValue()+3);
//		//Integer -> double
//		System.out.println(ii.doubleValue());
//		//Integer -> float
//		System.out.println(ii.floatValue());
//		//Integer -> String
//		System.out.println(ii.toString()+3);


//	Auto Boxing 예문

//	public static void main(String[] args) {
//		//auto Boxing
//		Integer i = 10;
//		Double d = 3.14;
//		Float f = 3.14f;
//		Character c = 'A';
//		
//		//auto Unboxing
//		int ii = i;
//		double dd = d;
//		float ff = f;
//		char cc = c;
//		
//		System.out.println(ii);
//		System.out.println(dd);
//		System.out.println(ff);
//		System.out.println(cc);
		
//	Random 클래스 예문
	
	public static void main(String[] args) {
		Random random = new Random(); //seed: 현재시간
		Random random2 = new Random(2); //seed: 2
		Random random3 = new Random(2); //seed: 2
		//현재시간의 값을 정수로 볼 수 있는 메서드
		System.out.println(System.currentTimeMillis());
		for (int i=0; i<5; i++) {
			System.out.println("기본생성자: "+random.nextInt(10));
		}
		for (int i=0; i<5; i++) {
			System.out.println("random2: "+i+"번째 값: "+random2.nextInt(10));
		}
		for (int i=0; i<5; i++) {
			System.out.println("random3: "+i+"번째 값: "+random3.nextInt(10));
		}

	}
}


