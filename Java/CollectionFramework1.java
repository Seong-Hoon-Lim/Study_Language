package org.java_mentorseries.day11;

//	 ■ 컬렉션 프레임워크(Collection Framework)
//	  : 데이터를 효율적으로 다루기 위한 클래스들의 집합 // JAVA에서 제공하는 자료구조
//	  - 자료구조(Data Structure)
//	  : 자료들을 저장할 때, 효율적인 구조로 저장하는 것(데이터의 구조)
//
//	 ■ Collection 인터페이스를 구현하는 클래스 종류
//	  - Set
//	  - List
//	  - Queue
//	  - Map
//
//	 ■ 제공되는 메서드
//	  - add(E e): 지정요소(e) 추가
//	  - contains(Object obj): 객체 obj 존재여부 확인
//	  - isEmpty(): 컬렉션이 비어있는지 여부 확인
//	  - isIterator(): 컬렉션의 iterator 반환
//	   ※ iterator: 컬렉션 요소에 접근해서 반복적으로 요소 접근시 도움을 주는 객체
//	  - remove(Object obj): 객체 obj 제거
//	  - size(): 요소 개수 반환
//
//	 ■ 제네릭(Generic): 클래스가 다룰 객체를 미리 명시하는 기법
//		-> 제네릭 == 일반화
//		-> 모든 종류의 타입을 다룰 수 있도록, 클래스나 메서드를 타입 매개변수를 이용 선언
//
//	   제네릭 사용방법
//		: 클래스명 뒤에 <E>,<K>,<V>와 같은 형식으로 사용
//		  단, <>안에 구현 시 알파벳 사용하는 경우에는 클래스만 들어갈 수 있다.
//
//	   제네릭 사용구간
//		1) 제네릭 클래스: 클래스 뒤에 제네릭 기법 사용
//		2) 제네릭 메서드: 메서드 뒤에 제네릭 기법 사용
//
//
//	 ■ 제네릭타입 매개변수
//	  - 관례적으로 널리 사용되는 타입명은 하나의 대문자 알파벳을 사용
//	  1) E(Element): 배열이나 집합들의 요소 타입을 지정
//	  2) T(Type): 변수의 자료형과 같은 타입을 지정
//	  3) S,U: 여러개의 제네릭 기법을 사용할 때 많이 사용
//	  4) K(Key): 키 타입 지정시 사용
//	  5) V(Value): 값 타입 지정시 사용


public class CollectionFramework1 {
	
//	Generic 예문
	
//	public static void main(String[] args) {
//		Value v = new Value();
//		v.<Integer>typeSearch(3);
//		v.typeSearch(3.14);
//		v.typeSearch(3.14f);
//		v.typeSearch('a');
//		v.typeSearch("hello");
//		v.typeSearch(true);
//	}
//}
//
//class Value {
//	public <T> void typeSearch(T x) {
//		if (x instanceof Integer) {
//			System.out.println(x+"는 정수입니다."); 
//		}
//		else if (x instanceof Double || x instanceof Float) {
//			System.out.println(x+"는 실수입니다."); 
//		}
//		else if (x instanceof Character) {
//			System.out.println(x+"는 문자형입니다."); 
//		}
//		else if (x instanceof String) {
//			System.out.println(x+"는 문자열입니다."); 
//		}
//		else if (x instanceof Boolean) {
//			System.out.println(x+"는 논리형입니다."); 
//		}
//	}
//}

//	Generic 클래스를 활용 예문
	
	public static void main(String[] args) {
			A<Integer>a1 = new A<>();
			a1.x = 10;
			a1.y = 20;
			System.out.println(a1.x+a1.y);
			
			A<String>a2 = new A<>();
			a2.x = "hello";
			a2.y = "world";
			System.out.println(a2.x+a2.y);
	}	
}
	
class A<T> { // 클래스에서 매개변수로 타입을 지정했을 경우 호출 시 어떤 타입인지 명시필요
	T x;
	T y;
}
