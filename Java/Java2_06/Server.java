package Java2_06;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		try ( ServerSocket serverSocket = new ServerSocket(9000) ) {
				System.out.println("Server is ready..");
				
				while (true) {
					System.out.println("Server: 연결 요청을 기다리는 중...");
					//클라이언트와 연결되면 소켓을 받아옴
					Socket socket = serverSocket.accept();
					System.out.printf("Server: [%s]과 연결되었습니다!\n",  socket.getInetAddress());
					//클라이언트로 보낼 outputstream을 생성
					DataOutputStream out = new DataOutputStream( socket.getOutputStream() );
					//클라이언트로 문자열을 전송함
					out.writeUTF("여긴 서버다요~~~~~~~");
					System.out.println("Server: 데이터 전송이 완료되었습니다");
					socket.close();
				}
			
		} catch (IOException e) {
				System.out.println("Error: Port가 사용중입니다.");
				System.out.println("Error: 연결 중 오류가 발생하였습니다!!");
		}
	}
}
