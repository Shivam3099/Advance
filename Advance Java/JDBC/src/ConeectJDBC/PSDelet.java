package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PSDelet {
	public static void main(String[] args) throws Exception {
		testUpdate();
	}

	public static void testUpdate() throws Exception {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
		
		int id=4;
		
		PreparedStatement ps =  conn.prepareStatement("delete from employee where id = ? ");
		
		
		ps.setInt(1, id);
		
		
		int rs = ps.executeUpdate();
		System.out.println(rs+"delete");
		
	      ps.close();
	      conn.close();
	}	
	}


