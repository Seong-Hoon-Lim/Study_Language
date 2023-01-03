package org.java_mentorseries.day07;

import java.rmi.StubNotFoundException;

//	 ■ 상속: 부모클래스의 기능을 자식클래스가 물려받는 것
//	  -> 부모클래스에서 작성한 기능의 재사용을 위해 사용됨.
//	 -상속방법:
//	   [구조]
//		class 클래스명 extends 부모클래스명 {}
//
//	  ※ 상속 시 주의할 점
//		- 생성자는 상속 되지 않는다.
//		- 다중상속 지원x
//		- 클래스 앞 final 키워드는 다른 클래스가 상속 불가
//			ex) final class Parent {}
//				class Child extends Parent {} 하게 되면 오류 발생됨.
//
//	  ※ 부모클래스 - super class
//	     자식클래스 - sub class
//
//
//	예문1
public class Inheritance {

	public static void main(String[] args) {
		Student st = new Student();
		st.breath();
		st.learn();
		
		Teacher t = new Teacher();
		t.eat();
		t.teach();

	}

}

class Person {
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person {
	void learn() {
		System.out.println("배우기");
	}
}


class Teacher extends Person {
	void teach() {
		System.out.println("가르치기");
	}
}


