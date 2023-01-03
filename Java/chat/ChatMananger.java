package chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatMananger implements Runnable {
	ChatRoom chatRoom; //유저가 속해있는 채팅방
	Socket socket; //서버와 연결된 유저의 소켓
	DataInputStream dis; //서버와 연결된 유저의 inputstream (유저가 보내면 이쪽으로 들어옴)
	String nickName; //서버와 연결된 유저의 닉네임
	
	public ChatMananger(ChatRoom chatRoom, Socket socket) {
		this.chatRoom = chatRoom;
		this.socket = socket;
		try {
			this.dis = new DataInputStream(socket.getInputStream());
			this.nickName = dis.readUTF(); //유저의 닉네임을 받아옴
			this.chatRoom.add_user(nickName, socket);
		}catch(IOException e) {
			System.out.println("SERVER_Error: 현재 채팅방에 유저를 추가할 수 없습니다!");
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				//현재 채팅방에서 내가 보낸 메세지가 도착했다 (서버에게 도착했다)
				String message = dis.readUTF();
				//채팅방의 모든 유저들에게 메세지를 전송한다
				chatRoom.send_message(nickName, message);
			}
			catch(IOException e) {
				//예외가 발생했다는 것은 현재 유저가 채팅방을 떠났다는 것을 의미함
				try {
				chatRoom.remove_user(nickName);
				} catch (Exception e2) {	}
			}
		}
	}
}