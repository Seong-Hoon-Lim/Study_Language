package org.java_mentorseries.day08;

import org.java_mentorseries.day08.OuterClass.Inner;

//	 ■ 내부클래스(Inner Class): 클래스 내부에서 생성된 클래스
//	   내부 클래스의 구조
//		<구조>
//		 class OuterClass {
//			class InnerClass {
//				...
//			}
//		}
//	   내부 클래스의 사용목적
//		: 클래스간의 관계가 긴밀할 때 사용하여 코드를 간결하게 하기위해 사용
//	  ※ 내부 클래스도 클래스이기 때문에 선언부에 접근제어자를 사용할 수 있다
//	  -> private class InnerClass
//	  -> protected class InnerClass
//
//	 ■ 내부 클래스의 종류 -> 선언 되는 위치에 따라 종류가 나눠짐
//	   1) 인스턴스 클래스
//	   2) 스태틱 클래스
//	   3) 지역 클래스
//	   4) 익명 클래스
//
//	 1) 인스턴스 클래스: 외부 클래스에서 멤버 변수 위치에 선언
//	  - 클래스의 내부에서 인스턴스(객체)멤버처럼 다뤄지며, 인스턴스 멤버들과 상호작용 가능
//		 <구조>
//		 class OuterClass {
//			class InnerClass {
//				...
//			}
//		}
//
//	 2) 스태틱 클래스: 외부 클래스에서 멤버 변수 위치에 선언
//	  - 클래스의 내부에서 static 멤버처럼 다뤄지며 static 멤버들과 상호작용 가능
//		 <구조>
//		 class OuterClass {
//			static class InnerClass {
//				...
//			}
//		}
//
//	 3) 지역 클래스: 메서드 내부 지역변수 위치에 선언
//	  - 메서드나 초기화 블록의 내부에서 다뤄지며, 선언된 영역 내부에서 사용
//		 <구조>
//		 class OuterClass {
//			void A() {
//				class InnerClass {
//					...
//				}
//			}
//		}
//
//
//
//

public class InnerClass1 {

//	public static void main(String[] args) {
//		
//	
//	}
//
//}
//
////	예문1
//
//class A {
//	static class StaticInner{}
//	class InstanceInner{}
//	//객체 생성
//	StaticInner st1 = new StaticInner();
//	InstanceInner i11 = new InstanceInner();
//	
//	static void StaticMethod() {
//		StaticInner st2 = new StaticInner();
////		InstanceInner ii2 = new InstanceInner(); -> 스태틱에서는 인스턴스 멤버 접근 불가
//	}
//	
//	void InstanceMethod() {
//		StaticInner st3 = new StaticInner();
//		InstanceInner i11 = new InstanceInner();
//	}
//
//}

//	예문2
	
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a의 값: "+oc.a);
		System.out.println("OuterClass의 b의 값: "+OuterClass.b);
		
//	 내부 클래스의 객체를 생성하는 방법
//	   외부클래스.내부클래스명 객체명 = new 외부클래스생성자().내부클래스생성자
//	                         = 외부클래스객체.내부클래스생성자();
		
		System.out.println("=== inner 클래스 접근하기 ===");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("Inner의 C의 값: "+i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값: "+si.d);
		
//		s1.staticMethod(); -> 객체를 사용하지 않고 클래스명을 사용해서 호출가능
		OuterClass.StaticInner.staticMethod();
	}
}

class OuterClass {
	int a = 3;
	static int b = 4;
	class Inner {
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner class>");
			
		}
	}
	static class StaticInner {
		int d = 6;
		static int stot = 10;
		public static void staticMethod() {
			System.out.println("<Static class>");
		}
	}
}
