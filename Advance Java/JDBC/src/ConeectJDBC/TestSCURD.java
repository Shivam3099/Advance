package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSCURD {
public static void main(String[] args) throws Exception {
	testSelect();
}

public static void testSelect() throws Exception    {    
	Class.forName("com.mysql.jdbc.Driver").newInstance();

    Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
    Statement stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(" "+"select * from employee"); 

    while (rs.next()) {
    	System.out.println(rs.getString(1)+" ");
    	System.out.println("/t"+rs.getString(2)+" ");
    	System.out.println("/t"+rs.getString(3)+" ");
    	System.out.println("/t"+rs.getString(4)+" ");
    	System.out.println("/t"+rs.getString(5)+" ");
   }
     conn.close();
     stmt.close();
     rs.close();

}

}
