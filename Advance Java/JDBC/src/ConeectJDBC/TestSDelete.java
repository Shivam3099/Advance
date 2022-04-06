package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestSDelete {
   public static void main(String[] args) throws Exception {
   testUpdate();	
}

    public static void testUpdate() throws Exception {
	 Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
	Statement stmt = conn.createStatement();
	int i = stmt.executeUpdate("Delete From Employee Where id=8");
    System.out.println(i+"Delete");
    conn.close();
    stmt.close();
    
    }
}
