package Java2_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TopGun {
	public static void main(String[] args) throws Exception{
		
		URL site = new URL("https://movie.naver.com/movie/bi/mi/basic.naver?code=81888");
		URLConnection connection = site.openConnection();
		//연결된 사이트에서 inputstream을 받아온다.
				BufferedReader reader = new BufferedReader(
				new InputStreamReader(connection.getInputStream(), "UTF-8")
				);
				String line = reader.readLine(); //한 줄 읽음
				boolean check = false; //한줄 평이 나오는지 체크하는 변수
				//전부 읽었을 시 null을 반환
				while (line != null) {
					//한줄평이 끝났다.
					if (line.contains("</p>")) {
						check = false;
					}
					
					//현재 줄이 공백으로만 이루어져있지 않다면 출력하세요
					if (check && !line.trim().equals("")) { //스포일러 말이 나온 직후이다.
						System.out.println(line); //한줄평 출력
						
					}
					//한줄평이 시작되었다.
					if (line.contains("스포일러 컨텐츠")) {
						check = true;
						
					}
					
					line = reader.readLine(); // 다음 한 줄을 읽음
					
				}

		}	
			
	}