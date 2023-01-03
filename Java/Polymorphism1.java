package org.java_mentorseries.day07;

//	 ■ 접근제어자 종류
//	  public: 같거나 다른 패키지 모두 접근할 수 있는 접근제어자
//	  private: 자식이 상속받을 수 없는 필드
//	  defualt: 같은 패키지내에서만 접근할 수 있는 접근제어자
//	  protected: 다른 패키지에서는 자식 패키지에만 접근할 수 있는 접근제어자
//
//	 ■ 다형성: 한 가지의 타입이 여러가지 형태의 인스턴스를 가질 수 있는 것
//
//	 ■ 다형성의 방법 → 부모자식간의 casting(형변환)
//	 ■ 업캐스팅(upcasting):
//		: 자식클래스의 객체가 부모클래스의 참조 변수로 형변환 되는 것
//		 <구조> 부모클래스 변수 = 자식 객체값;
//
//	 ■ 동적 바인딩(Dynamic Binding):
//		컴파일 시점에서는 부모클래스의 필드로 인지하나, 런타임 시점에서는 자식클래스의 필드로
//		호출 할 메서드를 묶는 것

//	예문
public class Polymorphism1 {

	public static void main(String[] args) {
		Student1 st1 = new Student1("가길동",13,"게임하기",3);
		st1.info();
		st1.study();
		System.out.println(st1.grade);
		//업캐스팅
		Human h1 = new Student1("나길동",17,"롤하기",3);
		h1.info();
		
		//업캐스팅 되었기 때문에 Human클래스의 객체변수 grade와 study() 메서드 사용불가
		//h1.study(); 실행시 오류
		//System.out.println(h1.grade); 실행시 오류
	}
}

class Human {
	String name;
	int age;
	String hobby;
//	Shift+Alt+s -> Generate Constructor using Fields: 매개변수 자동생성
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("hobby:"+hobby);
	}
}

class Student1 extends Human {
	int grade;
	public Student1(String name, int age,String hobby, int grade) {
		super(name, age, hobby);
		this.grade = grade;
	}
	void info() { //오버라이딩
		super.info();
		System.out.println("grade:"+grade);
	}
	void study() {
		System.out.println("공부하기~");
	}
}

//	동적 바인딩 예문
//	public static void main(String[] args) {
//		
//		A obj = new B(); //부모면수 = 자식값 -> 업캐스팅
//		obj.methodA();
//		// obj.methodB(); //오류발생
//	}
//}
//
//class A {
//	void methodA() {
//		System.out.println("methodA");
//	}
//}
//
//class B extends A {
//	void methodB() {
//		System.out.println("methodB");
//	}
//}

