package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PSUpdate {
public static void main(String[] args) throws Exception {
	testUpdate();
}

public static void testUpdate() throws Exception {
Class.forName("com.mysql.jdbc.Driver").newInstance();
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
	String Fname = "raju";
	int id=4;
	String Lname = "rastogi";
	
	PreparedStatement ps =  conn.prepareStatement("update employee set fname= ?,Lname =? where id = ? ");
	
	ps.setString(1, Fname);
	ps.setInt(3, id);
	ps.setNString(2, Lname);
	
	int rs = ps.executeUpdate();
	System.out.println(rs+"update");
	
      ps.close();
      conn.close();
}	
}

