package Java2_03;

class MyThread extends Thread {
	
	@Override //Thread 생성할 때는 반드시 run 메서드를 오버라이딩 해야한다.
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Run!!");
			
			try {
				Thread.sleep(1000); //1000ms == 1s
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class MyRun implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runnable!!");
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) { //Main 도 하나의 스레드이다.
		MyRun r = new MyRun();
		Thread t = new Thread(r);		
		MyThread thread = new MyThread();
		
		t.start();
		thread.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main!");
		}
	}
}
