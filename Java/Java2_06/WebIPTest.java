package Java2_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class WebIPTest  {
	public static void main (String[] args) throws Exception{
		
		//DNS에 대한 정보를 취득
		String url = "www.naver.com";
		InetAddress addr = InetAddress.getByName(url);
		System.out.println("IP주소: " + addr.getHostAddress());
		
		//URL에 대한 정보를 취득(html코드)
		URL site = new URL("https://www.naver.com");
		URLConnection connection = site.openConnection();
		//연결된 사이트에서 inputstream을 받아온다.
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(connection.getInputStream(), "UTF-8")
		);
		String line = reader.readLine(); //한 줄 읽음
		//전부 읽었을 시 null을 반환
		while (line != null) {
			System.out.println(line); //읽은 한 줄을 출력
			line = reader.readLine(); // 다음 한 줄을 읽음
		}
		
		reader.close();
	}	
	
}
