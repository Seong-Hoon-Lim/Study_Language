package Java2_04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class IOTest {
	private static String fileName;

//	public static void get_files() {
		//상대경로: 현재 나의 위치를 기준으로 한 경로
		//절대경로: 최상위 디렉터리에서 해당 파일(디렉터리)까지의 전체 경로
		//.. : 현재 위치에서의 상위 디렉터리
		//. : 현재 위치
//		String filePath = ".\\"; //현재 디렉터리
//		File file = new File(filePath);
//		String[] files = file.list(); //현재 디렉터리의 모든 파일과 디렉터리를 가져온다.
		
//		//모든 파일을 순회
//		for (int i = 0; i < files.length; i++) {
//			//해당 디렉터리의 해당 파일의 이름으로 파일 객체를 생성한다.
//			File thisFile = new File(filePath, files[i]);
//			if (thisFile.isDirectory()) {
//				System.out.println(fileName  + ":" + "디렉터리");
//			}
//			else {
//				System.out.printf("%s: 파일(%,dbyte) \n"),
//						fileName, thisFile.length());
//			}
//			System.out.println(thisFile.getName());		
//		}
//	}
	
	static void file_io() {
		
		try (
				FileInputStream in = new FileInputStream("input.txt");
				FileOutputStream out = new FileOutputStream("output.txt");
				)	
		
				{
					System.out.println("파일 열기 완료");
					
					//내가 읽은 1byte 데이터를 int 형으로 반환
					int data = in.read();
					out.write('a');
					while (in.read() != -1) {			
						System.out.print((char)data);			
						data = in.read();
					}		
		
		} catch (FileNotFoundException e) {
				e.printStackTrace();
				
		} catch (IOException e) {
				
		} 
		
	}
	
	public static void main(String[] args) {
//		get_files();
		file_io();
	}
}
