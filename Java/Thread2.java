package org.java_mentorseries.day12;

//	 ■ 스레드의 우선순위
//	  -> 스레드는 시분할 방식으로 CPU의 시간을 분배하여 실행하지만, 사용자가 직접 스레드의
//		 우선순위를 지정해서 특정 스레드에 더 많은 실행시간 부여 가능
//
//	 ■ 우선순위 지정 메서드
//	  1) void setPriority(int newPriority): 우선순위 지정
//	  2) int getPriority(): 우선순위 반환
//	   - 우선순위는 1 ~ 10 까지 부여 가능
//	   - 설정하지 않을 경우 기본적으로 5
//
//	 ■ 스레드의 라이프사이클
//	  -> 스레드는 현재 상태에 따라 네가지 상태로 분류할 수 있으며, 이것이 Life Cycle이다
//	  스레드의 상태
//	  - new: 스레드가 키워드 new를 통해서 인스턴스화 된 상태
//	   -> Runnable이 될 수 있는 상태이며, 아직 대기열에 올라가지 못한 상태
//	  - Runnable: start()메서드가 호출되면 new 상태에서 Runnable 상태가 된다.
//	   -> Runnable상태가 되면 실행할 수 있는 상태로 대기하게 되며 스케줄러에 의해 선택되면
//	      run()메서드를 바로 수행
//	  - Blocked: 실행중인 스레드가 sleep(),join() 메서드를 호출하게 되면, Blocked
//				 상태가 된다.
//	   -> Blocked상태가 되면 스케줄러에 의해서 선택 받을 수 없다.
//	  - Dead: run()메서드의 실행을 모두 완료하게 되면 스레드는 Dead 상태가 된다.
//	   -> 할당받은 메모리와 정보 모두 삭제된다.
//
//	 ■ sleep() 메서드: 스레드를 지정한 시간 동안 block 상태로 만든다.
//	   -> 시간은 1000분의 1초까지 지정할 수 있으며, 지정된 시간이 지나면 다시 실행가능
//
//	 ■ yield(): 자신의 시간을 양보하는 메서드.
//	   -> 스레드가 작업을 수행하던 중 yield()를 만나면, 자신에게 할당된 시간을 다음차례
//		  스레드에게 양도
//
//	 ■ join(): 특정한 스레드가 작업을 먼저 수행할 때 사용
//	   -> 실행 순서를 지켜야 하는 스레드들을 제어

public class Thread2 {
	
//	스레드 예문3

//	public static void main(String[] args) {
//		Runnable t = new MyThread3(); //업캐스팅
//		Thread t1 = new Thread(t,"thread1"); //new Thread(Runnable target,String name)
//		t1.setPriority(1); //우선순위 1로 지정
//		
//		System.out.println("t1의 우선순위는: "+t1.getPriority());
//		
//		Thread t2 = new Thread(t,"thread2");
//		//우선순위 지정 x -> 우선순위: 5
//		System.out.println("t3의 우선순의는: "+t2.getPriority());
//		
//		Thread t3 = new Thread(t,"thread3");
//		t3.setPriority(10); //우선순위 10으로 지정
//		System.out.println("t3의 우선순의는: "+t3.getPriority());
//		
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//
//}
//
//class MyThread3 implements Runnable {
//	@Override
//	public void run() {
//			for (int i=0; i<5; i++) {
//				System.out.println("<"+Thread.currentThread().getName()+">");
//			}
//			for (int i=0; i<1000; i++) {} //시간지연
//	}
//	
//}

//	sleep 예문

//	public static void main(String[] args) {
//		SleepThread t = new SleepThread();
//		t.start();
//	}
//}
//
//class SleepThread extends Thread {
//	public void run() {
//		System.out.println("카운트 다운 5초");
//		for (int i=5; i>=0; i--) {
//			System.out.println(i);
//			if (i!=0) {
//				try {
//					Thread.sleep(1000); //1000당 1초
//				}
//				catch (InterruptedException ie) {
//					System.out.println(ie.toString());
//				}
//			}
//		}
//		System.out.println("종료!");
//	}
//}

// join 예문


public static void main(String[] args) {
		MyThread8 s1 = new MyThread8();
		MyThread9 s2 = new MyThread9();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		try {
			t1.join(); //t1을 제외한 나머지 스레드 block
		}
		catch (InterruptedException ie) {System.out.println(ie.toString());}

		t2.start(); //t2을 제외한 나머지 스레드 block
		try {
			t2.join();
		}
		catch (InterruptedException ie) {System.out.println(ie.toString());}
		
		for (int i=0; i<10; i++) {
			System.out.println("메인스레드: "+i);
		}
	}
}

class MyThread8 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("t1: "+i);
		}
		System.out.println("<<t1완료>>");
	}
}

class MyThread9 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("t2: "+i);
		}
		System.out.println("<<t2완료>>");
	}
}



