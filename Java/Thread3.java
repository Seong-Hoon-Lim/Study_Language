package org.java_mentorseries.day12;

//	 ■ 스레드의 동기화: 멀티스레드로 작업 시,스레드 간 작업이 서로 간섭되지 않도록 하는 것
//	  - 멀티스레드 기법은 자원을 공유하는데,이 때 동시에 같은 자원을 처리한다면 자원 값이
//	    실제 처리해야 하는 작업보다 더 많은 작업이 발생할 수 있다.
//
//	 ■ 스레드 동기화 (Thread Synchronized) 방법
//	  1) 동시에 작업하는 메서드에 Synchronized 키워드 걸기
//	  <구조>
//	  public Synchronized void 메서드명() {
//	   // 수행할 작업
//				}
//
//	  2) Synchronized 영역 지정하기
//	  <구조>
//	  void 메서드명() {
//	  Synchronized(스래드객체) {
//	   //수행할 작업
//				}
//			}
//
//	 ■ wait(): 스레드를 대기시킨다
//	 ■ notify(): 대기중인 스레드를 깨운다
//
//	  void wait(): notify()가 호출될 때까지 대기
//	  void wait(long timeout): timeout 시간만큼 대기
//	  notify(): 대기중인 한 스레드만 깨움
//	  notifyAll(): 대기중인 모든 스레드를 깨움
//

public class Thread3 {
	
//	스레드 동기화 예문

//	public static void main(String[] args) {
//		Atm atm = new Atm();
//		Thread mom = new Thread(atm,"엄마");
//		Thread son = new Thread(atm,"아들");
//		
//		mom.start();
//		son.start();
//	}
//}
//class Atm implements Runnable {
//	int money=100000;
//	@Override
//	public void run() {
//		for (int i=0; i<5; i++) {
//			withdraw(1000);
//			printInfo();
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {}
//		}
//	}
//	void withdraw(int money) {
//		Thread.yield();
//		this.money-=money;
//		System.out.println(Thread.currentThread().getName()+
//				"이(가)"+money+"원 출금");
//		}
//	void printInfo() {
//		System.out.println("현재금액: "+this.money+"원");
//	}
//}

//	스레드 동기화 예문2
	
//	public static void main(String[] args) {
//		MyThreadB s1 = new MyThreadB();
//		Thread t1 = new Thread(s1,"A");
//		Thread t2 = new Thread(s1,"B");
//		Thread t3 = new Thread(s1,"C");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//}
//class MyThreadB implements Runnable {
//	Ticketing ticket = new Ticketing();
//	@Override
//	public void run() {
//		ticket.ticketing();
//	}
//}
//class Ticketing {
//	int ticketNumber = 1;
//	public void ticketing() {
//		if (ticketNumber > 0) {
//			System.out.println(Thread.currentThread().getName()+"가 티켓팅 성공");
//			ticketNumber--;
//		}
//		else {
//			System.out.println(Thread.currentThread().getName()+"가 티켓팅 실패");
//		}
//		System.out.println(Thread.currentThread().getName()+"가 티켓팅 시도후 티켓수");
//	}
//}

//	스레드 동기화 예문3

	public static void main(String[] args) {
			Account account = new Account();
			Son son = new Son(account);
			Mom mom = new Mom(account);
			son.start();
			mom.start();
	}
}
class Account {
	int money=0;
	//입금,출금
	public int showMoney() {
		return money;
	}
	public synchronized void setMoney() {
		try {
			Thread.sleep(1000); //1초 대기
		} catch (InterruptedException ie) {System.out.println(ie.toString());}
		this.money+=2000;
		System.out.println("어머니가 용돈을 입금했습니다. 현재잔액: "+this.showMoney());
		this.notify();
	}
	public synchronized void getMoney() {
		while (money<=0) {
			try {
				System.out.println("통장 잔고가 없어서 아들 대기 중");
				this.wait();
			} catch (InterruptedException i) {}
		}
		this.money-=2000;
		System.out.println("아들이 용돈을 출금했습니다. 현재잔액: "+this.showMoney());
	}
}
class Son extends Thread {
	private Account account;
	Son(Account account) {
		this.account=account;
	}
	public void run() {
		for (int i=0; i<10; i++) {
			account.getMoney();
		}
		
	}
}
class Mom extends Thread {
	private Account account;
	Mom(Account account) {
		this.account=account;
	}
	public void run() {
		for (int i=0; i<10; i++) {
			account.setMoney();
		}
	}
}
