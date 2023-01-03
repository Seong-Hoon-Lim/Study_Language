package Java2_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest2 {
	static void copy_paste() {
		try (
				FileInputStream in = new FileInputStream("잔망.jpg");
				FileOutputStream out = new FileOutputStream("루피.jpg");
				
				) {
				int data = in.read();
					while (data != -1) {
							out.write(data);
							data = in.read();
				}									
					System.out.println("잔망 복사 완료!");
					
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		copy_paste();
	}
	
}
