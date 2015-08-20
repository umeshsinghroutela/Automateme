package practice.one.script;



import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class SeleniumDatabaseConnection {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/";
		String dataBaseName = "predict";
		String userName = "root";
		String passWord = "root";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url+dataBaseName,userName,passWord);
			
			String sqlQuery = "Select * from Users";
			Statement statement = (Statement) conn.createStatement();
			ResultSet result = (ResultSet) statement.executeQuery(sqlQuery);
			
			result.next();
			System.out.println(result.getString("id"));
			System.out.println(result.getString("loginname"));
			System.out.println(result.getString("screenname"));
			System.out.println(result.getString("password"));
			System.out.println(result.getString("email"));
			System.out.println(result.getString("FormSourceId"));
			System.out.println(result.getString("PasswordNonce"));
			System.out.println(result.getString("PasswordNonceCreatedOn"));
			
			
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		finally{
			if(conn!=null)
				conn=null;
		}
	}

}
