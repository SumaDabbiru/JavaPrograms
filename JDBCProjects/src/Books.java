import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Books {

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
		String drop = "drop table books";
		String create = "create table books (id int(10) primary key, title varchar(50), author varchar(50), price float(10), qty int(10))";

		String sql1 =  "insert into books values (1001, 'Java for dummies', 'Tan Ah Teck', 11.11, 11)"; 
		String sql2 = "insert into books values (1002, 'More Java for dummies', 'Tan Ah Teck', 22.22, 22)"; 
		String sql3 = "insert into books values (1003, 'More Java for more dummies', 'Mohammad Ali', 33.33, 33)"; 
		String sql4 = "insert into books values (1004, 'A Cup of Java', 'Kumar', 44.44, 44)"; 
		String sql5 = "insert into books values (1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55)";
		
		st.executeUpdate(drop);
		st.executeUpdate(create);
		st.executeUpdate(sql1);
		st.executeUpdate(sql2);
		st.executeUpdate(sql3);
		st.executeUpdate(sql4);
		st.executeUpdate(sql5);
		
//		int x = st.executeUpdate(sql5);
//		
//		if (x==1)
//			System.out.println("Record Inserted");
//		else
//			System.out.println("Record Failed");
			
		ResultSet rs = st.executeQuery("Select * from books");
		while (rs.next ()){
			System.out.println(rs.getInt(1)+ " "+ rs.getNString(2) + " "+ rs.getNString(3) +" "+ rs.getFloat(4)+" "+ rs.getInt(5));
		}
		
		//UPDAATE
        String strUpdate = "update books set price = price*1.07, qty = qty+1 where id = 1001";
        System.out.println("The SQL statement is: " + strUpdate + "\n");  // Echo for debugging
        int countUpdated = st.executeUpdate(strUpdate);
        System.out.println(countUpdated + " records affected.\n");
        
		ResultSet rs1 = st.executeQuery("Select * from books");
		while (rs1.next ()){
			System.out.println(rs1.getInt(1)+ " "+ rs1.getNString(2) + " "+ rs1.getNString(3) +" "+ rs1.getFloat(4)+" "+ rs1.getInt(5));
		}
		
        // INSERT multiple records
        String sqlInsert = "insert into books values "
              + "(3002, 'Gone Fishing 2', 'Kumar', 22.22, 22),"
              + "(3003, 'Gone Fishing 3', 'Kumar', 33.33, 33)";
        System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
        int countInserted = st.executeUpdate(sqlInsert);
        System.out.println(countInserted + " records inserted.\n");
        
		ResultSet rs2 = st.executeQuery("Select * from books");
		while (rs2.next ()){
			System.out.println(rs2.getInt(1)+ " "+ rs2.getNString(2) + " "+ rs2.getNString(3) +" "+ rs2.getFloat(4)+" "+ rs2.getInt(5));
		}
		
        // DELETE records with id>=3000 and id<4000
        String sqlDelete = "delete from books where id >= 3000 and id < 4000";
        System.out.println("The SQL statement is: " + sqlDelete + "\n");  // Echo for debugging
        int countDeleted = st.executeUpdate(sqlDelete);
        System.out.println(countDeleted + " records deleted.\n");
        
		ResultSet rs3 = st.executeQuery("Select * from books");
		while (rs3.next ()){
			System.out.println(rs3.getInt(1)+ " "+ rs3.getNString(2) + " "+ rs3.getNString(3) +" "+ rs3.getFloat(4)+" "+ rs3.getInt(5));
		}
	}

}
