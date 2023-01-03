package org.java_mentorseries.day06;

import java.util.Scanner;

//	 ■ 객체 타입 배열: 같은 클래스로 만들어진 변수들이 나열된 집합
//	  -> 같은 구조를 갖고 있으나 다른 객체 값을 저장!
//	  -> 구조: ObjectArray = {객체변수1,객체변수2,객체변수3,객체변수4,...}
//	  생성방법: 클래스명 객체배열명[] = new 클래스명[크기];
//	   ex) Aclass ar[] = new Aclass[3];
//	    ※ 클래스명(): 을 통해 꼭 객체를 생성해야만 객체 내 필드 접근 가능

//	예문1

class ObjectArray {
//	public static void main(String[] args) {
////		클래스명 객체배열명[] = new 클래스명[크기];
//		Aclass ar[] = new Aclass[3];
//		// Aclass 객체가 생성되지 않았기 때문에 오류 발생되므로 객체생성 필수
//		ar[0] = new Aclass();
//		ar[0].x=100;
//		ar[0].f1();
//		System.out.println(ar[0].x);
//	}
//	
//}
//
//class Aclass {
//	int x;
//	void f1() {
//		System.out.println("f1()");
//	}
//}


//	예문2
		
	
//	public static void main(String[] args) {
//		
//		Animal animals[] = new Animal[3];
//		for (int i=0; i<3; i++) {
//		animals[i] = new Animal();
//		}
//		
//		animals[0].kind = "고양이";
//		animals[0].name = "나르";
//		animals[0].age = 1;
//		
//		animals[1].kind = "강아지";
//		animals[1].name = "초코";
//		animals[1].age = 3;
//		
//		animals[2].kind = "고양이";
//		animals[2].name = "니코";
//		animals[2].age = 1;
//		
//		for (int i=0; i<3; i++) {
//			animals[i].info();
//		}
//		
//		
//	}
//}
//
//class Animal {
//	
//	String kind;
//	String name;
//	int age;
//	
//	void info() {
//		System.out.println("kind:"+kind);
//		System.out.println("name:"+name);
//		System.out.println("age:"+age);
//	}
//	
//}

//	예문3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User users[] = new User[4];
		for (int i=0; i<4; i++) {
			users[i] = new User();
			
		}
		
		for (int i=0; i<4; i++) {
			System.out.print("name:");
			users[i].name = sc.next();
			System.out.print("phone:");
			users[i].phone = sc.next();
			System.out.print("age:");
			users[i].age = sc.nextInt();
			System.out.print("gender:");
			users[i].gender = sc.next();
		}
		
		for (int i=0; i<4; i++) {
			users[i].info();
		}
	}
}

class User {
	String name;
	String phone;
	int age;
	String gender;
	
	void info() {
		System.out.println("name:"+name);
		System.out.println("phone:"+phone);
		System.out.println("age:"+age);
		System.out.println("gender:"+gender);
		
	}
	
}