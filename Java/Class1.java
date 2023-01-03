package org.java_mentorseries.day05;


//	■ 객체지향 언어: 현실에 존재하는 사물과 개념들을 소프트웨어적으로 구현하고,
//	             그 구현된 객체들이 상호작용하여 데이터를 처리하는 방식
//
//	  객체지향 언어의 목적: 코드의 재사용!
//	  객체지향 언어의 특징
//	   1) 추상화: 공통적인 특징을 모아 놓은 것
//	   2) 상속: 부모 클래스의 것을 자식 클래스가 받아오는 것
//	   3) 캡슐화(은닉성): 사용하는 사람은 기능만 알면되는 것
//	   4) 다형성: 같은 모양을 하고 있으나 다른 의미를 갖는 것
//		 ① 메서드 오버로딩(Over loading)
//			: 함수의 중복정의
//		 ② 메서드 오버라이딩(Over riding)
//			: 함수의 재정의
//
//	■ 클래스(Class): 객체를 만들기 위한 설계도
//	  코드를 객체로 만드는 것 -> 클래스 설계하기
//
//	■ 인스턴스(Instance): 클래스를 통해 만들어진 형태
//	  인스턴스화 -> 클래스를 통해 객체를 만드는 과정
//
//	  클래스 사용 -> 객체의 속성 -> 변수
//			   -> 객체의 기능 -> 메서드
//
//	  클래스 구조:
//      class 클래스명 {
//			// 속성(변수)
//			// 기능(메서드)
//			}
//		※ 클래스명은 앞글자를 대문자로!
//
//	  클래스로 객체 만드는 방법:
//		자료형 참조변수 = new 클래스명();
//	  참조변수: 클래스로 생성된 객체 값(인스턴스) 저장공간 // 주소를 저장하는 변수
//	  new: 메모리 할당
//	  클래스명(): 클래스로 객체를 생성
//	  -> 클래스로 객체 값을 만들 메모리를 할당(new)하고, 객체 값을 생성(클래스명())해서,
//	     변수에 저장한다.
//
//	  객체 내 값을 사용하는 방법: 객체변수.필드명
//	  -> 객체 내 변수, 메서드를 사용한다는 것
//

// 예문: ClassA 에 객체를 생성하여 실행

//public class Class {
//
//	public static void main(String[] args) {
//		//자료형 변수 = 객체값;
//		//클래스명 참조변수 = new 클래스명();
//		ClassA ca = new ClassA(); //ClassA의 ca 객체 생성
//		System.out.println(ca.x); //객체 ca에서 x값을 호출
//		ca.f1(); //객체 ca에서 f1()값을 호출
//	}
//}
//
//class ClassA {
//	int x = 10;
//	void f1() {
//		System.out.println("f1()");
//	}
//}

// 예문

public class Class1 {
	
	public static void main(String[] args) {
		Car mycar1 = new Car();
		Car mycar2 = new Car();
//			System.out.println("시동 처음 초기화:"+mycar.powerOn);
//			System.out.println("차의 색상 초기화:"+mycar.color);
//			System.out.println("바퀴의 수 초기화:"+mycar.wheel);
//			System.out.println("속력 초기화:"+mycar.speed);
//			System.out.println("와이퍼 작동 초기화:"+mycar.wipeOn);
//			
//			mycar.power();
//			System.out.println("시동 메서드 동작:"+mycar.powerOn);
//			
//			mycar.power();
//			System.out.println("시동 메서드 다시 동작:"+mycar.powerOn);
//			
//			mycar.color = "black";
//			System.out.println("현재 차의 색상:"+mycar.color);
		
		
		mycar1.color="red";
		mycar2.color="block";
		mycar1.sppedUp();
		mycar2.wiper();
		
		System.out.println("mycar1의 색:"+mycar1.color);
		System.out.println("mycar2의 색:"+mycar2.color);
		
		System.out.println("mycar2의 속도:"+mycar1.speed);
		System.out.println("mycar2의 속도"+mycar2.speed);
		
		System.out.println("mycar2의 와이퍼 작동여부:"+mycar1.wipeOn);
		System.out.println("mycar2의 와이퍼 작동여부:"+mycar2.wipeOn);
		
	}
}
	
class Car {
	boolean powerOn; //자동차 시동
	String color; //자동차 색상
	int wheel; //자동차 바퀴수
	int speed; //자동차 속력
	boolean wipeOn; //와이퍼 동작
	
	void power() {powerOn=!powerOn;} //true->false false->true
	void sppedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wipeOn=!wipeOn;} // true->false false->true
	}
		

		
	