package Java2_05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class DBTest {
	public static void main(String[] args) {
		
			String url = "jdbc:mariadb://localhost/koreait_db";
			String user = "root";
			String pw = "root";
			
			try {
			System.out.println("JDBC 드라이버 적재 중...");
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 적재 성공!");
			
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("DB 연결 성공!\n");			
			
			//Conncetion 객체에서 Statement 생성
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM student_tbl";
			ResultSet rs = stmt.executeQuery(query);			
			
			//다음에 가져올 레코드가 있는가?
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String tel  = rs.getString("tel");
				
				String format = "현재 보고 있는 사람의 정보 >> \n"
						+ "아이디: {0} / 이름: {1} / 주소: {2} / 전화번호: {3} ";
				String message = MessageFormat.format(format, id, name, addr, tel);
				System.out.println(message + "\n");
				
			}	
			
			
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 적재 실패");
			} catch (SQLException e) {
				System.out.println("URL / USER / PW 가 잘못되었습니다!");
				System.out.println("Database 연결 실패!");
			}
		
	}
}
