package Java2_03;

import java.security.PublicKey;
import java.util.Map;
import java.util.Set;

import javax.xml.stream.events.StartDocument;

class Word extends Thread {
	
	public Word(ThreadGroup group,String name) {
		super(group, name);
	}
	
	
	void auto_save() {
		System.out.println("자동 저장중...");
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
				auto_save();
				
			} catch (Exception e) {
				System.out.println("워드 파일 에러");
				System.out.println(getName() + " 스레드가 종료됩니다..");
				break;
			}
		}
		
	}
}

public class DemonTest {
	public static void main(String[] args) {
		
		ThreadGroup newGroup = new ThreadGroup("새 그룹");
		
		
		Word w1 = new Word(newGroup, "자동저장 스레드1");
		Word w2 = new Word(newGroup, "자동저장 스레드2");
		
//		w.setDaemon(true);
		w1.start();
		w2.start();
		
		Map<Thread, StackTraceElement[]>  map = Thread.getAllStackTraces();
		Set<Thread> set = map.keySet();
		
		for (Thread thread : set) {
			System.out.print("스레드 이름: " + thread.getName());
			
			if (thread.isDaemon()) { //보조 스레드인가?
				System.out.println("(보조스레드)");
			}
			else {
				System.out.println("(주 스레드)");
			}
			System.out.println("소속 그룹: " + thread.getThreadGroup().getName());
		}
		
		Thread.currentThread().getThreadGroup().list();
		
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {}
		System.out.println("Word 파일을 종료합니다..");
		newGroup.interrupt(); //그룹에 속해있는 스레드를 전부 종료
		
	}
}
