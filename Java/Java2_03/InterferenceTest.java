package Java2_03;

class BTSConcert {
	int ticketCount = 1;
	synchronized void ticketing() { //스레드 동기화 synchronized
		String name = Thread.currentThread().getName();
		System.out.println("현재 티켓팅에 시도중인 팬: " 	+ name);
		
		if (ticketCount > 0) {
			System.out.println(name + "아싸 성공!");
			ticketCount--;
		} else {
			System.out.println(name + ": 아오 ㅋㅋ");
		}
		System.out.println(name + "이 시도하고 남은 티켓 수: " + ticketCount);
	} 
}

class Fan extends Thread {
	
	BTSConcert concert;
	public Fan(BTSConcert concert, String name) {
		super(name);
		this.concert = concert;
	}
	
	@Override
	public void run() {
		this.concert.ticketing();
	}
}

//스레드 간섭 예제
public class InterferenceTest {
	public static void main(String[] args) {
		BTSConcert concert = new BTSConcert();
		Fan fan1 = new Fan(concert, "철수");
		Fan fan2 = new Fan(concert, "영희");
		Fan fan3 = new Fan(concert, "맹구");
		
		fan1.start();
		fan2.start();
		fan3.start();
		
	}
}
