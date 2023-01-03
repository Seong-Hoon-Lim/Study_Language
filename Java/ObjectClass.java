package org.java_mentorseries.day07;

//	 ■ Object클래스: 모든 클래스의 조상클래스
//	  -> Object클래스에서 받아오는 모든 메서드를 사용할 수 있음.
//
//	 ■ Object클래스 메서드 종류
//	  - toString(): 객체정보를 문자열로 출력
//	  - equals(): 두 객체가 동일한가를 비교
//	  - getClass(): 객체의 클래스정보를 가져옴
//
//
//

public class ObjectClass {
	
//	예문1

	public static void main(String[] args) {
		Aclass a1 = new Aclass();
		Aclass a2 = new Aclass();
		
		//toString(): 객체정보를 문자열로 출력
		System.out.println(a1.toString());
		System.out.println(a1);
		
		//equals(): 두 객체가 동일한가를 비교
		System.out.println(a1.equals(a1));
		
		//객체의 클래스정보를 가져옴
		System.out.println(a1.getClass());
		
	}

}
class Aclass {
	
}
