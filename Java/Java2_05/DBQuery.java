package Java2_05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBQuery {
	
	Connection con = null;
	public DBQuery(Connection con) {
		this.con = con;
		
	}
	
	public String login(String id, String pw) throws SQLException 
	
	{
		
		String query = "SELECT `nick` FROM member WHERE `id` = ? AND `pw` = ?";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1, id);
		stmt.setString(2, pw);
		ResultSet result = stmt.executeQuery();
		return result.next() ? result.getString("nick") : null;
		
	}
}
