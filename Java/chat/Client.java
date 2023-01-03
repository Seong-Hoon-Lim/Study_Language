package chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Scanner;

import Java2_05.DBConnectionFactory;
import Java2_05.DBQuery;

public class Client {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //DB로그인을 위한 스캐너
		Object[] clientObj = new Object[2]; //스레드가 저장될 배열
		String chatServerIP = "192.168.2.254";	//유저가 접속할 채팅서버IP
		int chatServerPort = 9000;			//유저가 접속할 채팅서버Port
		String nickName = null;
		
		System.out.println("CLIENT: DB서버에 접속합니다...");
		DBQuery query = new DBQuery(new DBConnectionFactory("DBinfo.txt").connection());
		System.out.println("CLIENT: DB서버 접속 완료...!");
		
		do {
			System.out.print("ID를 입력하세요 >> ");
			String id = input.next();
			System.out.print("PW를 입력하세요 >> ");
			String pw = input.next();
			System.out.println("접속을 시도합니다..");
			try {
				nickName = query.login(id, pw);
				System.out.println("CLIENT: 로그인에 성공하였습니다..!");
			} catch (SQLException e){
				System.out.println("쿼리 확인 바람!!");
				System.exit(0);
			}
		}while(nickName == null);
		
		
		System.out.println("CLIENT: 채팅 서버에 연결합니다...");
		//서버와 연결할 소켓을 생성
		try (Socket socket = new Socket(chatServerIP, chatServerPort)){
			System.out.println("CLIENT: SERVER와 연결이 완료되었습니다..!");
			//송신/수신 스레드 객체 생성
			ClientSend send = new ClientSend(nickName, socket);
			ClientRecieve recieve = new ClientRecieve(socket);
			//스레드 시작 후 저장
			send.start();	recieve.start();
			clientObj[0] = send;	clientObj[1] = recieve;
			while(true) {}
		}
		catch(UnknownHostException e) {
			System.out.println("CLIENT_Error: IP오류입니다!!");
		}
		catch(IOException e) {
			System.out.println("CLIENT_Error: 채팅 서버가 열려있지 않습니다!!");
		}
	}
}


