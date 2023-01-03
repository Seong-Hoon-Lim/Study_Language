package org.java_mentorseries.day07;

//	 ■ 오버라이딩: 자식클래스에서 부모클래스로부터 받아온 메서드를 재정의 하는 것
//	  -> 자식에 맞는 기능으로 맞춰 동작하기 위해
//	 ※ 오버로딩과 차이
//	  - 오버로딩: 메서드 중복정의 (함수명 or 매개변수 개수 or 매개변수 타입)
//	  - 오버라이딩: 메서드 재정의
//
//	 ※ 부모클래스의 필드 사용방법 -> super. 사용
//
//	  상속과 생성자
//	   - super(): 부모클래스의 생성자 호출
//		-> 무조건 자식클래스의 생성자 첫 줄에서 이루어짐
//		-> 작성하지 않을 시, 컴파일러가 자동 호출


public class Overriding {

//	예문1
//	public static void main(String[] args) {
//		Leader leader = new Leader();
//		leader.say();
//
//	}
//
//}
//
//class Student2 {
//	void learn() {
//		System.out.println("배우기");
//	}
//	void eat() {
//		System.out.println("밥먹기");
//	}
//	void say() {
//		System.out.println("선생님 안녕하세요~");
//	}
//}
//
//class Leader extends Student2 {
//	void lead() {}
//	void say() { //메서드 오버라이딩
//		System.out.println("선생님께 인사!");
//		super.say();
//	}
//}
	
	
	public static void main(String[] args) {
		SportsCar mycar = new SportsCar("red",300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}
	
}

class Car {
	int wheel;
	int speed;
	String color;
	Car() {} // 69번 오류 해결 1번째 방법. 부모클래스 생성자 생성
	Car(String color) {
		this.color = color;
	}
}

class SportsCar extends Car {
	int speedLimit;
	SportsCar(String color, int speedLimit) {
//		super(color); //69번 오류 해결 2번째 방법. 매개변수를 전달해서 매개변수 생성자 호출
		this.color = color;
		this.speedLimit = speedLimit;
	}
}
