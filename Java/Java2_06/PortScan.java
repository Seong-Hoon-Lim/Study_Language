package Java2_06;

import java.io.IOException;
import java.net.ServerSocket;

public class PortScan {
	public static void main(String[] args) {
		
		ServerSocket serversocket = null;
		System.out.println("Port 스캔을 시작합니다...");
		for (int i = 1; i < 65536; i++) {
			//i번 port에 bind해서 서버 소켓을 생성한다.
			try (ServerSocket serverSocket = new ServerSocket(i);) {
				
		} catch (IOException e) {
			System.out.println(i + "번 Port가 사용중입니다!");
		}
	}
		
	}
}
