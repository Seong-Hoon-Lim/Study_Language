package Java2_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;

public class DBConnectionFactory {
	private String driver;
	private String jdbc;
	private String dbms;
	private String host;
	private String port;
	private String database;
	private String user;
	private String password;
	private String url;
	
	
	
	public DBConnectionFactory (String fileName) {
		read_infomation(fileName);
	}
	
	private void read_infomation(String fileName) {
		
		try (
				FileReader reader = new FileReader(fileName);
				BufferedReader bfreader = new BufferedReader(reader);
				)
		
			{
			
			driver = bfreader.readLine(); //한줄 씩 읽는다.
			jdbc = bfreader.readLine(); //한줄 씩 읽는다.
			dbms = bfreader.readLine(); //한줄 씩 읽는다.
			host = bfreader.readLine(); //한줄 씩 읽는다.
			port = bfreader.readLine(); //한줄 씩 읽는다.
			database = bfreader.readLine(); //한줄 씩 읽는다.
			user = bfreader.readLine(); //한줄 씩 읽는다.
			password = bfreader.readLine(); //한줄 씩 읽는다.			
			String format = "{0}:{1}://{2}:{3}/{4}";
			url = MessageFormat.format(format, jdbc, dbms, host, port, database);
			System.out.println("URL complete: " + url);
			
			} catch (FileNotFoundException e) {
				System.out.printf("Error: [%s] 파일을 찾을 수 없습니다!!\n",fileName);
				System.exit(0);
			} catch (IOException e) {
				System.out.printf("Error: [%s] 파일을 읽는 도중 에러 발생!!\n",fileName);
				System.exit(0);
			}
		
	}
		
		public Connection connection() {
			Connection  con = null;
			
				try {
						System.out.println("드라이버 적재 중...");
						Class.forName(driver);
						System.out.println("드라이버 적재 성공!");
						con = DriverManager.getConnection(url, user, password);
						System.out.println("DB 연결 성공!\n");			
						return con;
						
				} 
				
				catch (ClassNotFoundException e) {
						System.err.println("Error: Driver 적재 실패!");					
				} 				
				catch (SQLException e) {
						System.out.println("Error: DB 연결에 실패하였습니다.");
				}						
			
				return con;		
				
	}
		
		public static void main(String[] args) throws Exception {
				new DBConnectionFactory("DBinfo.txt").connection().close();
		}
	
}
