package org.java_mentorseries.day08;

//	 ■ 인터페이스(Interface)
//	  : inter(사이의) +face(마주하다)의 합성어로 물체들 사이에서 상호작용 매개역할
//
//	  ※ 클래스 -> 설계도 // 인터페이스 -> 규격
//
//	   인터페이스의 문법
//		- 구성
//		 o 상수: final 타입 변수명 = 값;
//		 o 추상메서드: abstract 리턴 타입 메서드명();
//
//	   인터페이스의 구현방법
//		<구조>
//		 interface 인터페이스명 {
//			필드
//		};
//
//	   클래스로 인터페이스 구현
//		<구조>
//		 interface 인터페이스명 {
//		 }
//
//		 class 클래스명 implements 인터페이스명 {
//			추상메서드 구현
//		 }
//
//	   인터페이스의 주의할 점
//		- 인터페이스 내 일반메서드 불가
//		- 인터페이스 내 변수 불가(상수만 가능)
//		- 인터페이스로 객체 생성 불가
//		- 인터페이스 내 멤버 메서드 abstract 키워드 생략가능
//		- 인터페이스 내 멤버 변수 final 키워드 생략가능

//	예문1

public class Interface {
	
//	public static void main(String[] args) {
//		B b = new B();
//		b.methodA();
//		b.methodB();
//		//b.x=30; 오류발생
//		
//	}
//
//}
//
//interface Ainter {
//	final int x = 10;
//	int y = 20; //final 생략가능
//	abstract void methodA();
//	void methodB(); //abstract 생략가능
//}
//
//class B implements Ainter {
//	@Override
//	public void methodA() {
//		System.out.println("methodA()입니다.");
//	}
//
//	@Override
//	public void methodB() {
//		System.out.println("methodB()입니다.");
//	}
//	
//}

//	예문2
	
	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		
	}
}

interface Proividable {
	void leisureSports();
	void sightseeing();
	void food();
}

class KoreaTour implements Proividable {
	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
	
}

class JapanTour implements Proividable {
	@Override
	public void leisureSports() {
		System.out.println("토쿄 타워 번지점프 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
	
}

class TourGuide {
//	※ 인터페이스를 사용하여 업캐스팅을 하면, 클래스간 관계가 느슨해지므로 코드 수정 용이
//	private Proividable tour = new KoreaTour(); //업캐스팅
	private Proividable tour = new JapanTour(); //업캐스팅
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}

