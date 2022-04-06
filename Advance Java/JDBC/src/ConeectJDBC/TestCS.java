package ConeectJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;



public class TestCS {
public static void main(String[] args) throws Exception {
	testCallable();
}

   public static void testCallable() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
  CallableStatement clstmt = conn.prepareCall("{call empCount(?)}");
  clstmt.registerOutParameter(1,Types.INTEGER);
  
  clstmt.execute();
  System.out.println("count"+clstmt.getInt(1));
   
   }
}
