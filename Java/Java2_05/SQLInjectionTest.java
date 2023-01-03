package Java2_05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLInjectionTest {
	public static void main(String[] args) {
		Connection con =  new DBConnectionFactory("DBinfo.txt").connection();
		String query = "SELECT * FROM member WHERE id = ? AND pw = ? ";
		
		try  (
				PreparedStatement stmt = con.prepareStatement(query);
				
				)
		{
			stmt.setString(1, "test");
			stmt.setString(2, "1");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("nick"));
			}
		} 
		catch (SQLException e) {
			System.err.println("Error");
		}
		
		
		
	}

}
