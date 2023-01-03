package org.java_mentorseries.day13;

import java.awt.image.DataBufferDouble;
import java.io.*;

//	 ■ IO(InputOutput): 프로그램의 데이터 입출력
//	 ■ 스트림(Stream): 데이터의 흐름
//	  스트림의 특징
//	   - 단 방향이다.
//	   - FIFO 구조를 갖고 있다.
//	   - 출력단위에 따라 바이트 기반과 문자단위로 분류된다.
//		> 출력단위 : 1byte -> Byte 기반 스트림
//				   문자 -> Char 기반 스트림
//
//	 ■ 바이트 기반 스트림 활용
//	  파일대상 - FileInputStream/FileOutputStream
//	  메모리대상 - PipedInputStream/PipedOutputStream
//	  오디오대상 - AudioInputStream/AudioOutputStream
//	  프로세스 - ByteArrayInputStream/ByteArrayOutputStream
//
//	  -> 스트림을 사용할 때는 인스턴스 생성 시 적절한 값을 전달한다.
//	  ex) 파일 입출력
//		FileInputStream fis = null;
//		fis = new FileInputStream("파일우치");
//		fis.read();
//
//	 ■ 바이트 보조 기반 스트림
//	   : 바이트 기반 보조스트림은 실제 바이트 기반 스트림의 성능을 향상시키는 역할을 한다.
//
//	  바이트 기반 보조스트림의 활용
//	  필터활용 - FilterInputStream/FilterOutputStream
//	  버퍼활용 - BufferedInputStream/BufferedOutputStream
//	  기본단위 데이터처리 - DataInputStream/DataOutputStream
//	  출력보조(print,printf,println) - PrintStream
//
//	  ex) BufferedInputStream 활용
//		FileInputStream fis = null;
//		fis = new FileInputStream("파일위치");
//		BufferedInputStream bis = new BufferedInputStream(fis);
//
//	 ※스트림의 예외 처리
//	  -> 입출력의 모든 메서드는 IOException이 발생할 가능성이 높으므로 예외처리가 필요
//


public class Stream1 {
	
//	파일 입출력 예문

//	public static void main(String[] args) throws IOException {
//			FileInputStream fis = null; //입력스트림
//			FileOutputStream fos = null; //출력스트림
//			fis = new FileInputStream("prac.txt"); //존재하는 파일과 연결
//			fos = new FileOutputStream("result.txt"); //존재하지 않으면 파일 생성, 존재하면 파일 덮어쓰기
//			
//			BufferedInputStream bis = new BufferedInputStream(fis);
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
//			
//			int data;
//			//data에 읽어온 바이트를 저장하는데,data의 값이 -1이 아닐때까지 반복
//			//-1: EOF(End Of File == 파일의 끝)
//			while ((data=fis.read())!=-1) {
//				bos.write(data);
//			}
//			//파일과의 연결을 닫는 작업
//			bos.close();
//			bis.close();
//	}
//}

//	파일 복사 프로그램의 예외처리 예문
	
	public static void main(String[] args) throws IOException {
			//파일복사프로그램
			FileReader fr;
			FileWriter fw;
			BufferedReader br;
			BufferedWriter bw;
			try {
				fr = new FileReader("prac1.txt");
				fw = new FileWriter("result1.txt");
				
				br = new BufferedReader(fr);
				bw = new BufferedWriter(fw);
				String line;
				while ((line=br.readLine())!=null) {
					bw.write(line);
				}
				bw.close();
				br.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
}