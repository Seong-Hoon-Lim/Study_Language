package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.MessageFormat;

//서버가 보낸 채팅을 받아서 화면에 출력하는 역할을 하는 클래스
public class ClientRecieve extends Thread {
	private DataInputStream dis;	//서버로부터 데이터를 받을 스트림
	
	//해당 유저와 서버와 연결된 소켓을 받아옴
	public ClientRecieve(Socket socket) throws IOException {
		//연결된 소켓으로부터 DataInputStream스트림과 DataOutputStream을 받아옴
		this.dis = new DataInputStream(socket.getInputStream());
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				//서버가 채팅을 보낸 내용을 출력한다
				System.out.println(dis.readUTF());
			} catch(Exception e) {}
		}
	}	
}

