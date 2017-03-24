package practice.one.script;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

public class SeleniumDatabaseConnection {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/";
		String dataBaseName = "sakila";
		String userName = "root";
		String passWord = "root";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver_5.1.5");
			Driver d = (Driver) DriverManager.getDriver("com.mysql.jdbc.Driver_5.1.5");
			conn = DriverManager.getConnection(url+dataBaseName,userName,passWord);
			
			String sqlQuery = "Select * from actor";
			Statement statement = (Statement) conn.createStatement();
			ResultSet result = (ResultSet) statement.executeQuery(sqlQuery);
			
			result.next();
			System.out.println(result.getString("actor_id"));
			System.out.println(result.getString("first_name"));
			System.out.println(result.getString("last_name"));
//			System.out.println(result.getString("password"));
//			System.out.println(result.getString("email"));
//			System.out.println(result.getString("FormSourceId"));
//			System.out.println(result.getString("PasswordNonce"));
//			System.out.println(result.getString("PasswordNonceCreatedOn"));
			
			
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		finally{
			if(conn!=null)
				conn=null;
		}
	}

}
