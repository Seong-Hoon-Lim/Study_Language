package Java2_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Computer implements Serializable{
	String spec;
	int price;
	
	public Computer(String spec, int price) {
		this.spec = spec;
		this.price = price;
	}
	
	
}

public class SerialTest {
	public static void main(String[] args) throws Exception {
		Computer com1 = new Computer("i7 게이밍컴퓨터", 1500000);
		
		//객체를 저장할 파일을 생성하고 연결한다
		FileOutputStream out = new FileOutputStream("data.dat");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		//oos를 사용해서 com1객체를 data.dat 파일에 쓴다
		oos.writeObject(com1);
		System.out.println("객체 저장 완료!");
		oos.close();
		out.close();
		
		FileInputStream in = new FileInputStream("data.dat");
		ObjectInputStream ois = new ObjectInputStream(in);
		Object o =  ois.readObject();
		
		if (o instanceof Computer) {
				Computer com = (Computer)o;
				System.out.println(com.spec);
				System.out.println(com.price);
		}
		
		
	}
}
