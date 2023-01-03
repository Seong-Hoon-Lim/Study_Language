package org.java_mentorseries.day06;

//	 ■ 생성자: 객체 생성시 호출되어, 변수들을 초기화 하는 메서드
//	  - 클래스와 이름이 같음
//	  - 리턴타입,반환값이 없음
//
//	  ■ 기본 생성자:
//
//		[구조]
//		- 구현부
//			클래스명(){}
//
//		- 호출부
//			클래스명();
//		ex)
//		- 구현부
//			Aclass() {
//				x = 100;
//			}
//		- 호출부
//			new Aclass();		
//
//
//	 ■ 매개변수 생성자
//		[구조]
//		- 구현부
//			클래스명(자료형 변수명..){}
//
//		- 호출부
//			클래스명(값);
//		ex)
//		- 구현부
//			Bclass(int a) {
//			x = a;
//			System.out.println("Bclass(): 매개변수 생성자,x:"+a)
//			}
//		- 호출부
//			new Bclass(10);	
//
//		※ 생성자의 매개변수의 값과 전달할 값의 개수는 동일해야함
//
//		※ 매개변수 생성자 구현 시, 디폴트 생성자가 없으면 디폴트 생성자 호출 불가!
//		※ this: 현재 객체를 지칭하기 위한 키워드
//			-> 매개변수의 변수 명과 객체 내 변수의 이름이 같을 때 this를 사용해 구분
//
//
//

public class Constructor {

//	예문1
//	public static void main(String[] args) {
//			new Aclass();
//
//	}
//
//}
//
//class Aclass {
//	//기본생성자(default 생성자)
//	public Aclass() {
//		System.out.println("Aclass 기본생성자()");
//	}
//}

//	예문2
//	public static void main(String[] args) {
//			CellPhone myphone = new CellPhone();
//			System.out.println(myphone.model);
//		
//	}
//}
//	
//class CellPhone {
//	String model = "Galaxy 8";
//	String color = "red";
//	int capacity = 60;
//	CellPhone() {
//		System.out.println("model:"+model);
//		System.out.println("color:"+color);
//		System.out.println("capacity:"+capacity);
//	}
//
//}	

// 예문3
	
//	public static void main(String[] args) {
//		Bclass b1 = new Bclass("가길동");
////		Bclass b2 = new Bclass(); 매개변수 생성자가 있을 경우 기본 생성자 생성불가
//		System.out.println(b1.name);
//	}
//}

//class Bclass {
//	String name;
//	Bclass(String name2) { //매개변수 생성자
//		System.out.println("Bclass의 매개변수 생성자()");
//		name = name2;
		// 매개변수와 멤버변수 이름이 같을 때 this를 붙인다.
		// this.name = name;
		
//	※ 생성자 오버로딩: 여러개 생성자 중복정의
//	Bclass() {}
//	Bclass(String name) {
//		System.out.println("Bclass의 매개변수 생성자()");
//		this.name = name;
//		
//	}
//}

//	예문4
	
	public static void main(String[] args) {
		Iphone myphone1 = new Iphone();
		Iphone myphone2 = new Iphone("iphone SE","white",70);
		System.out.println(myphone1.capacity);
		System.out.println(myphone2.capacity);
	}
}
class Iphone {
	String model;
	String color;
	int capacity;
	Iphone() {}
	Iphone (String model, String color, int capacity) {
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}
	void info( ) {
		System.out.println("model:"+model);
		System.out.println("color:"+color);
		System.out.println("capacity:"+capacity);
	}
}
	