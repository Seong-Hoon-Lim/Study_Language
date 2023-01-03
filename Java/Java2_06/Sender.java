package Java2_06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
	public static void main(String[] args) throws Exception{
		
		DatagramSocket socket = new DatagramSocket();
		String message = "UDP 통신입니다. : )";
		byte[] buf = message.getBytes();
		InetAddress addr = InetAddress.getByName("192.168.2.254");
		DatagramPacket packet = new DatagramPacket(buf, buf.length, addr, 9000);
		socket.send(packet);
		System.out.println("DATA를 전송하였습니다.");
		socket.close();
		
	}
}
