package org.java_mentorseries.day06;

//	 ■ 인스턴스 변수: 객체마다 갖는 고유한 변수
//	  - 인스턴스를 생성할 때 만들어지며, 각각의 인스턴스마다 자신의 값을 갖고 있음
//	  - 각 인스턴스맏 다른 값을 가져야 할 때 생성
//	  - 인스턴스 생성 시 (new 클래스명();) 메모리에 생성됨
//
//	 ■ 클래스 변수
//	  : 생성방법 -> class 클래스명() {
//					static 자료형 변수명; }
//		※ 변수 선언 시 자료형 앞에 static 키워드를 붙인다!
//
//	예문1
//

public class Class2 {

//	public static void main(String[] args) {
//		Member member1 = new Member();
//		Member member2 = new Member();
//		Member member3 = new Member();
//		Member member4 = new Member();
//		
//		member1.centerName="Hello";
//		member1.name="김철수";
//		member1.age=32;
//		member1.gender="남자";
//		
//		member2.centerName="Hello";
//		member2.name="김민호";
//		member2.age=28;
//		member2.gender="남자";
//		
//		member3.centerName="Hello";
//		member3.name="이영희";
//		member3.age=24;
//		member3.gender="여자";
//		
//		member4.centerName="Hello";
//		member4.name="고석천";
//		member4.age=32;
//		member4.gender="남자";
//		
//		Member.centerName="Bye";
//		System.out.println("member1-----");
//		member1.info();
//		System.out.println("member2-----");
//		member2.info();
//		System.out.println("member3-----");
//		member3.info();
//		System.out.println("member4-----");
//		member4.info();
//
//	}
//}
//
//class Member {
//	static String centerName;
//	String name;
//	int age;
//	String gender;
//
//	void info() {
//		System.out.println("center Name:"+centerName);
//		System.out.println("Name:"+name);
//		System.out.println("age:"+age);
//		System.out.println("gender:"+gender);
//		
//	}
//}
	
	// 예문2
	public static void main(String[] args) {
		System.out.println(Car.wheel);

		Car myCar1 = new Car();
		System.out.println(myCar1.speed);
			
		Car myCar2 = new Car();
			
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed:"+myCar1.speed);
		System.out.println("myCar2.speed:"+myCar2.speed);
		System.out.println("myCar1.wheel:"+myCar1.wheel);
		System.out.println("myCar2.wheel:"+myCar2.wheel);
			
		myCar2.speed = 100;
		myCar2.wheel = 5;
			
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed:"+myCar1.speed);
		System.out.println("myCar2.speed:"+myCar2.speed);
		System.out.println("myCar1.wheel:"+myCar1.wheel);
		System.out.println("myCar2.wheel:"+myCar2.wheel);
		}
	}

class Car {
		static int wheel=4; //클래스변수
		int speed; //인스턴스 변수
	}	
