package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	public static void main(String[] args) {
		//모든 UserManager 스레드를 저장하고 있는 List
		ArrayList<Thread> threadList = new ArrayList<>();
		//서버가 관리하고 있는 (소유하고 있는) 채팅방 1개
		ChatRoom chatRoom = new ChatRoom();
		
		System.out.println("서버를 시작합니다..");
		System.out.println("소켓을 생성합니다..");
		try(ServerSocket serverSocket = new ServerSocket(9000)) {
			while(true) {
				System.out.println("유저의 연결 요청을 기다리는 중..");
				Socket socket = serverSocket.accept();
				//ChatManager는 유저 한명을 관리(수신, 송신)역할을 맡음 (스레드로 병렬동작시킴)
				//해당 유저를 해당 채팅방에 관리하도록 하면서, 유저의 소켓도 전달
				ChatMananger manager = new ChatMananger(chatRoom, socket);
				//ChatManager 스레드를 생성하고 동작시킴
				Thread serverThread = new Thread(manager);
				serverThread.start();
				//생성된 ChatManager를 List에 추가한다
				threadList.add(serverThread);
			}
		} catch (IOException e) {
			System.err.println("Error: SERVER - PORT가 이미 열려있습니다!");
		} catch (Exception e) {
			System.err.println("Error: SERVER - 알 수 없는 에러가 발생하였습니다!");
		}
	}
}




