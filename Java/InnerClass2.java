package org.java_mentorseries.day08;

//	 4) 익명클래스(Anonymous): 이름이 없는 클래스
//	  -> 기존의 클래스를 오버라이딩해서 형성
//
//		익명클래스 사용목적: 인터페이스 또는 추상클래스를 일회성으로 구현할 때 활용
//
//	  ex)
//		 <기존 클래스의 구조>
//		  class Some {
//				private int a = 3;
//				int getter() {
//					return this.a;
//			}
//
//		  		void setter(int a) {
//						   this.a = a;
//					}
//			}
//
//		 <익명 클래스의 구조>
//		  Some anony = new Some() {
//				private int a = 3;
//				int getter() {
//					return this.a;
//			}
//				void setter(int a) {
//						   this.a = a;
//					}
//			}
//
//	예문

public class InnerClass2 {

//	public static void main(String[] args) {
//	
//		OutherClass1 o = new OutherClass1() {
//			void a() {
//				System.out.println("새롭게 정의된 익명클래스 메서드입니다.");
//			}
//		};
//		o.a();
//		OutherClass1 ok = new OutherClass1();
//		ok.a(); //익명클래스는 1회성
//	}
//}
//
//class OutherClass1 {
//	void a() {System.out.println("memthod a");}
//	void b() {}
//}

//	public static void main(String[] args) {
//		//Inter1 it1 = new Inter1(); -> interface는 객체를 생성할 수 X
//		Inter1 it = new Inter1() {
//
//			@Override
//			public void f1() {
//					System.out.println("inter1 imple f1()");
//			}
//		};
//		it.f1();
//	}
//}
//
//interface Inter1 {
//	void f1();
//}
////일반클래스
//class Inter1Imp1 implements Inter1 {
//	@Override
//	public void f1() {
//		
//	}
//	
//}

	public static void main(String[] args) {
//		Abstract ab = new Abstract(); // 객체생성 불가
		Abstract ab = new Abstract() {
			@Override
			void f2() {
				System.out.println("Abstract extends f2()");
			}
			
		};
		ab.f2();
	}
}

abstract class Abstract {
	abstract void f2();
}

























