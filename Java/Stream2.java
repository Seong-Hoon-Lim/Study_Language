package org.java_mentorseries.day13;

import java.io.*;

//	 ■ 객체 직렬화: JAVA시스템 내부에서 사용하는 객ㅊ나 데이터를 외부의 시스템에서
//	   사용할 수 있도록 byte단위의 데이터로 변환시키거나 다시 객체로 변환하는 기술
//
//	  객체 전송의 단계
//	   1) 직렬화된 객체를 바이트 단위로 분해한다.(marshalling)
//	   2) 직렬화 되어 분해된 데이터를 순서에 따라 전송
//	   3) 전송받은 데이터를 복구(unmarshalling)
//
//	 ■ 마샬링(marshalling)
//	  : 데이터를 byte단위의 데이터로 변환시키는 작업
//
//	  마샬링을 적용할 수 있는 데이터
//	   - 기본 자료형: boolean,char,byte,short,int,long,float,double,..
//	   - Serializable 인터페이스를 구현한 클래스로 만들어진 객체
//		<구조>
//		 class A implements Serializable {
//					...
//			}
//
//			A a = new A(); // Serializable 인터페이스는 메서드 없이 정보전달만
//
//	  사용할 클래스: ObjectOutputStream
//
//	 ■ 언마샬링(unmarshalling)
//	  : 객체 스트림을 통해 전달된 byte단위의 데이터를 원래 객체로 복구하는 작업
//		※주의할점. 어떤 객체 형태로 복구할 지 형변환을 명확하게 명시해야함
//
//	  사용할 클래스: ObjectInputStream


public class Stream2 {

//	Serializable(직렬화) 예문
	
	public static void main(String[] args) {
			marshalling();
			unmarshalling();
	}
	
	public static void marshalling() {
		try {
			FileOutputStream fos = new FileOutputStream("user.ser");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			User user1 = new User("test","1234","가길동");
			out.writeObject(user1);
			out.close();
			System.out.println("객체 직렬화 완료!");
			
		} catch(IOException e) {e.printStackTrace();}
	}
	public static void unmarshalling( ) {
		try {
			FileInputStream fis = new FileInputStream("user.ser");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			User user2 = (User)in.readObject();
			System.out.println(user2.toString());
			in.close();
			System.out.println("객체 복원 완료!");
		} catch (Exception e) {}
	}
}
class User implements Serializable {
	private String id;
	private String pw;
	private String name;
	public User(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
}