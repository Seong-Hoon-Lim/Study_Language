package Java2_06;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		
			//127.0.0.1 -> localhost. 내 컴퓨터를 의미함.
			String serverIP = "192.168.2.254";
			System.out.println("Client: 서버에 연결 시도 중...");
			//Socket을 생성하여 서버와 연결을 시도
			try ( Socket socket = new Socket(serverIP, 9000); ) {
				System.out.println("Client: 서버와 연결 완료!");
				//서버에서 데이터를 받아올 inputstream을 생성
				DataInputStream in = new DataInputStream(socket.getInputStream());
				//서버로부터 문자열을 전송받음
				System.out.println("Server 로 부터 받은 문자열: " + in.readUTF());
				System.out.println("Client: 연결을 종료합니다...");
				in.close();
			}
			//서버와 연결이 실패되었을 시, 혹은 데이터 전송 시 문제가 발생했을 시
			catch (IOException e) {
				System.out.println("Error: 서버가 열려있지 않습니다!!!");
			}
	}
}
