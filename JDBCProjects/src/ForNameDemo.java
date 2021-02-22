import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;


public class ForNameDemo 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username= "root";
		String password ="Password";
		Connection con = DriverManager. getConnection(url,username,password);
		
		if (con!= null)
			System.out.println("Hey Connection Established");
		
		Statement st = con.createStatement();
		
		String sql = "insert into employee values(1029,'Shan',54000)";
		int x = st.executeUpdate(sql);
		
		if (x==1)
			System.out.println("Record Inserted");
		else
			System.out.println("Record Failed");
			
		ResultSet rs = st.executeQuery("Select * from employee");
		while (rs.next ()){
			System.out.printf(rs.getInt(1)+ rs.getNString(2),rs.getInt(3));
		}
	}
}
