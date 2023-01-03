package chat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;

//현재 채팅중인 모든 유저들을 저장하고 있고, 모든 유저에게 송신/수신하는 기능을 정의하는 클래스
public class ChatRoom {
	//현재 채팅중인 모든 유저의 (닉네임: Key / DataoutputStream: Value) 
	HashMap<String, DataOutputStream> users = new HashMap<String, DataOutputStream>();
	//현재 채팅방에 유저를 추가하는 메소드
	//채팅방에 추가할 유저의 닉네임과 서버와 연결된 소켓을 받아옴
	void add_user(String nickName, Socket socket) throws IOException {
		//현재 채팅방 유저 리스트에 유저를 추가한다
		this.users.put(nickName, new DataOutputStream(socket.getOutputStream()));
		//현재 채팅방의 모든 유저들에게 메세지를 전송한다
		this.send_message("SERVER", " ---- [" + nickName + "] 유저가 채팅방에 접속하였습니다 -----");
	}
	
	//현재 채팅방에서 유저를 제거하는 메소드
	void remove_user(String nickName) throws IOException {
		//현재 채팅방 유저 리스트에서 해당 닉네임 유저를 제거한다
		this.users.remove(nickName);
		//현재 채팅방의 모든 유저들에게 메세지를 전송한다
		this.send_message("SERVER", " ---- [" + nickName + "] 유저가 채팅방에서 퇴장하였습니다 -----");
	}
	
	//현재 채팅방에 있는 모든 유저에게 메세지를 전송하는 메소드
	void send_message(String sendUser, String message) throws IOException {
		//현재 채팅방에 있는 모든 유저를 순회한다
		for (String nickName : users.keySet()) {
			//해당 유저의 DataOutputStream으로부터 해당 유저에게 write로 문자열을 송신
			users.get(nickName).writeUTF(sendUser + ": " + message);
		}
	}
}








