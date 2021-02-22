import java.sql.*;  



public class ForNameDemoOracle {
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, SQLException 
	{
//		
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String username= "system";
//		String password = "manager";
//		Connection con = DriverManager.getConnection(url,username,password);

		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		
		if (con!= null)
			System.out.println("Hey Connection Established");
		
	}

}
