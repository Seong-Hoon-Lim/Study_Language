package org.java_mentorseries.day12;

//	 ■ 스레드(Thread): 하나의 프로세스 안에서 두가지 이상의 일을 하도록 하는 것
//	  ※용어정리
//	   프로세스(Process): 실행중인 프로그램
//	   스레드(Thread): 프로세스에서 작업을 수행하는 것
//	  -> JAVA에서 Thread 란 Multi-Thread Process
//		  즉 두가지 이상의 작업을 하는 프로세스 구현을 의미
//
//	 ■ 프로세스가 실행되는 방식
//	  1) 시간분할 방식: 모든 프로세스에게 동일한 시간을 할당하고 골고루 실행되는 방식
//	  2) 선점형 방식: 각각의 프로세스에게 우선순위를 부여하고 높은순으로 실행되는 방식
//
//	 ■ 개발자가 스레드 처리시 하는 일
//	  - 자바 스레드로 작동할 작업이 무엇인지 코드로 작성
//	  - 스레드 코드가 실행할 수 있도록 JVM한테 요청
//
//	 ※스레드 스케줄링 -> JVM이 스레드 처리시 하는 일
//	  - 스레드가 몇개 존재하는 지
//	  - 스레드가 실행되는 프로그램 코드의 메모리 위치가 어디인지
//	  - 현재 스레드의 상태는 무엇인지
//	  - 스레드의 우선순위는 몇인지
//
//	 ■ 스레드 코드 생성
//	  1) Thread 클래스 상속
//	  <구조>
//	   class T1 extends Thread {
//				public void run() { //run()메서드 오버라이딩
//					작업할 내용
//				}
//		}
//	  호출시 -> Th1 t1 = new Th1(); //인스턴스 생성
//		      t1.start();
//
//	  2) Runnable 인터페이스 구현
//	  <구조>
//	   class T2 implements Runnable {
//				public void run() { //run()메서드 오버라이딩
//					작업할 내용
//				}
//		}
//	  호출시 -> Th2 t2 = new Th2(); //인스턴스 생성
//			  Thread t = new Thread(t2);
//			  t.start();

public class Thread1 {
	
//	Thread 예문

//	public static void main(String[] args) {
//			//JVM 스레드 요청
//			//1) Thread 클래스 상속받은 클래스의 스레드를 요청
//			MyThread th1 = new MyThread();
//			th1.start();
//			//2) Runnable 인터페이스를 구현한 클래스의 스레드를 요청
//			MyThread2 th2 = new MyThread2();
//			//Thread(Runnable targe)
//			Thread t = new Thread(th2);
//			t.start();
//			
//			for (int i=0; i<10; i++) {
//				System.out.println("메인 함수 진행중~"+i);
//			}
//	}
//}
//
////1) Thread 클래스 상속받아 작업을 구현
//class MyThread extends Thread {
//	//run()메서드 오버라이딩(재정의)
//	public void run() {
//		//스레드가 해야할 작업 구현
//		for (int i=0; i<10; i++) {
//			System.out.println("Thread 진행 중"+i);
//		}
//	}
//}
////2) Runnable 인터패이스를 구현하여 작업을 구현
//class MyThread2 implements Runnable {
//	@Override
//	public void run() {
//		for (int i=0; i<10; i++) {
//			System.out.println("Runnable 진행 중"+i);
//		}
//	}
//}

//	Thread 예문2

	public static void main(String[] args) {
		System.out.println("현재 실행되고 있는 스레드의 이름: "+Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태: "+Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위: "+Thread.currentThread().getPriority());
	}
}
