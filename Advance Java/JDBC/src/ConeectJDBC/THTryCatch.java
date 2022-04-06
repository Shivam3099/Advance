package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class THTryCatch {
public static void main(String[] args) throws Exception {
			testInsert();
	}

	public static void testInsert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
		 conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		
		  int i;
		      try {
				i = stmt.executeUpdate("insert into employee values(8,'Rakesh','verma',30000,7)");
				i = stmt.executeUpdate("insert into employee values(9,'rahul','kanva',30000,2)");
				i = stmt.executeUpdate("insert into employee values(10,'satyam ','mandloi',30000,6)");
				i = stmt.executeUpdate("insert into employee values(11,'nisarg','verma',30000,7)");
				conn.commit();
			} catch (Exception e) {
				conn.rollback();
				System.out.println(e.getMessage());
			}
			
		    
		    System.out.println("insert");
		    
		    
		    conn.close();
		    stmt.close();
	}
	
}

