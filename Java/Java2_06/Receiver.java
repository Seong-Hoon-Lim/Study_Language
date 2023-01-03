package Java2_06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
	public static void main(String[] args) throws Exception{
		
		while (true) {
			byte[] buf = new byte[256];
			//데이터를 수신할 port번호를 열어놓고 기다림
			DatagramSocket socket = new DatagramSocket(9000);
			//데이터를 받을 패킷 형태를 설정
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("택배를 기다립니다...");
			socket.receive(packet);
			System.out.println("택배 도착!! 얏호!");
			System.out.println("내용물: " + new String(buf));			
			socket.close();
			
			}
			
	}
}
