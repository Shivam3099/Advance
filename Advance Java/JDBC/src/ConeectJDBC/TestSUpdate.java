package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSUpdate {
	public static void main(String[] args) throws Exception {
   testUpdate();
}

	public static void testUpdate() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

	    Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
	    Statement stmt = conn.createStatement();
	   int rs = stmt.executeUpdate("update employee set salary=50000 where id = 7");
	   
	   System.out.println(rs+"Update");
	   conn.close();
	   stmt.close();

		
	}
}