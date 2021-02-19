import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;


public class ForNameDemo 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username= "root";
		String password ="Password";
		Connection con = DriverManager. getConnection(url,username,password);
		
		if (con!= null)
			System.out.println("Hey Connection Established");
		
	}
}
