package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSend extends Thread{
	private Scanner input;			//채팅을 보낼 스캐너
	private String nickName;
	private DataOutputStream dos;	//서버에게 데이터를 보낼 스트림
	
	//해당 유저의 닉네임과, 서버와 연결된 소켓을 받아옴
	public ClientSend(String nickName, Socket socket) throws IOException {
		this.input = new Scanner(System.in);
		this.nickName = nickName;
		//연결된 소켓으로부터 DataOutputStream을 받아옴
		dos = new DataOutputStream(socket.getOutputStream());
		//서버에게 내 닉네임을 전송 (채팅방에 입장했다고 닉네임 전송해줌)
		dos.writeUTF(nickName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				//채팅을 입력한다
//				System.out.printf(nickName + ": ");
				String message = input.nextLine();
				//입력한 채팅을 서버에게 보낸다
				dos.writeUTF(message);
			}catch(IOException e) {}
		}
	}
}


