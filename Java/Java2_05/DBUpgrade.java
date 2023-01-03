package Java2_05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class DBUpgrade {
			
		public static Connection connection() {
			String url = "jdbc:mariadb://localhost/koreait_db";
			String user = "root";
			String pw = "root";
			Connection  con = null;
			
			try {
					System.out.println("JDBC 드라이버 적재 중...");
					Class.forName("org.mariadb.jdbc.Driver");
					System.out.println("드라이버 적재 성공!");
					con = DriverManager.getConnection(url, user, pw);
					System.out.println("DB 연결 성공!\n");			
					return con;
				
			} catch (Exception e) {
					System.out.println("Error: DB 연결에 실패하였습니다.");
		}			
			
				return con;
	}	
		
		//DB에 새로운 데이터를 넣는 메소드
		static void insert_data(Statement stmt) {
			Scanner input = new Scanner(System.in);
			System.out.println("새 데이터를 삽입합니다 >> ");
			System.out.println("이름: ");
			String name = input.nextLine();
			System.out.println("주소: ");
			String addr = input.nextLine();
			System.out.println("전번: ");
			String tel = input.nextLine();
			
			String message = "INSERT INTO `student_tbl` (`name`, `addr`, `tel`) "
					+ "VALUES (\"{0}\", \"{0}\", \"{0}\")";
			
			
			String insertSql =MessageFormat.format(message, name, addr, tel);
			
			try {
					stmt.executeUpdate(insertSql);
					System.out.println("새 데이터 삽입 완료!!");
			} catch (SQLException e) {
					System.out.println("Error: SQL문 오류!");
			}
		}
		
		//DB에  데이터를 변경하는 메소드
		static void update_data(Statement stmt) {
								//3) 해당 id 사람의 이름을 입력받은 이름으로 변경함
			
			Scanner input = new Scanner(System.in);
			//1)누구의 데이터를 수정해야하는지 입력으로 받아옴 (id 값)
			System.out.print("바꿀 id를 입력하세요 >> ");
			int id = input.nextInt();
			//DB에서 해당 ID가 있는지 검사
			String selectQuery = "SELECT * FROM `student_tbl` WHERE id =  " + id;
			
			try {
					if ( stmt.executeQuery(selectQuery).next() ) {
						System.err.println("Error: 없는 ID를 조회하였습니다!");
						return;
					}
				} catch (SQLException e) {
					System.out.println("SELECT 쿼리가 잘못되었습니다!");
					return ; //메소드 종료				
			}
			
			//2)바꿀 이름을 입력받음.
			System.out.println("바꿀 이름을 입력하세요 >> ");
			String name = input.next();
						
			//3) 해당 id 사람의 이름을 입력받은 이름으로 변경함
			String updateQuery ="UPDATE `student_tbl` SET name =  ' " + name +  "'  + "
					+ " WHERE id = " + id;
			
			try {
				stmt.executeUpdate(updateQuery);
				System.out.println("이름을 변경했습니다.");
			} catch (SQLException e) {
				System.out.println("Error: SQL문 오류!");
			}		
			
			
			
		}
		
		
			public static void main(String[] args) {
				Connection con = connection();
				if (con == null) {
					System.out.println("시스템 종료...");
					System.exit(0);
				}
				try 	(
						Statement stmt = con.createStatement();			
						
					) {
					Scanner input = new Scanner(System.in);					
					while (true) {
						System.out.println("메뉴 선택: 1. 추가 / 2. 수정 / 3. 종료");
					
						try {							
								switch(input.nextInt()) {
										case 1:
											insert_data(stmt);
											break;
										case 2:
											update_data(stmt);
											break;
										case 3:
											System.out.println("DB 조작을 종료합니다.. ^_^");
											con.close();
											System.exit(0);
										default:
											System.out.println("Error: 1아니면 2만 입력하세요");
								}
							} catch (Exception e) {
										System.out.println("Error: 제대로 숫자만 입력하세요...");
										
							}
							
						}
						
					} catch (SQLException e) {
						System.out.println("Error: 처리 중 오류 발생!");
				}
			
	}
}
