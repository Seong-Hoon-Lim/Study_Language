package Java2_03;

//매대 - 버퍼
class Buffer {
	private int data; //버퍼가 가진 실제 데이터
	private boolean isEmpty = true; //버퍼가 비어있는지 체크하는 변수
	
	//버퍼에 있는 데이터를 가져감
	public synchronized int get() {
		if (isEmpty) {
			try {
				wait(); //데이터가 생산될 때까지 기다림
			} catch (Exception e) {}
		}
		isEmpty = true; //데이터를 가져감
		notifyAll(); //생산자를 깨움
		return data;
		
	}
	
	//버퍼에 있는 데이터를 채움
	public synchronized void set(int data) {
		if (!isEmpty) {
			try {
					wait();
			} catch (Exception e) {}
			
		}
		
		isEmpty = false; //데이터를 채워넣음
		this.data = data; //현재 버퍼의 데이터를 설정함
		notifyAll(); //소비자를 깨움
		
	}
		
}

//생산자 - 버퍼에 데이터를 채워넣는 역할
class Producer extends Thread{
	private Buffer buff;
	public Producer(Buffer buff) {
		this.buff = buff;
	}
	
	@Override
	public void run() {
		//버퍼에 데이터를 10번 채워넣음
		for (int i = 0; i < 10; i++) { //i번째 데이터를 채워넣음
			this.buff.set(i);
			System.out.printf("생산자:[%d]데이터를 생산하였습니다\n", i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					
				}
		}
	}	

}


//소비자 - 버퍼에 있는 데이터를 가져가는 역할
class Consumer extends Thread {
	private Buffer buff;
	public Consumer(Buffer buff) {
		this.buff = buff;
	}
	
	@Override
	public void run() {
		//버퍼에 데이터를 10번 가져옴
		for (int i = 0; i < 10; i++) { //i번째 데이터를 가져옴
			int data = this.buff.get(); //데이터를 가져옴
			System.out.printf("소비자:[%d]데이터를 가져왔습니다.\n", i);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					
				}
			
		}
	}
		
	
}


public class BufferTest {
	public static void main(String[] args) {
		Buffer buff = new Buffer();
		Producer pro = new Producer(buff);
		Consumer con = new Consumer(buff);
		pro.start();
		con.start();
		
	}
}
