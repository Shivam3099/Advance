package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PSInsert {

	public static void main(String[] args) throws Exception {
		testUpdate();
	}

	public static void testUpdate() throws Exception {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
		int id=7;
	    String Fname = "Dheeraj";
	    String Lname = "kumrawat";
	    int salary = 40000;
	    int dep_id = 3;
		
		PreparedStatement ps =  conn.prepareStatement("insert into employee values(?,?,?,?,?)");
		
		ps.setString(2, Fname);
		ps.setInt(1, id);
		ps.setNString(3, Lname);
		ps.setInt(4, salary);
		ps.setInt(5, dep_id);
		int rs = ps.executeUpdate();
		
		System.out.println(rs+"Insert");
		
	      ps.close();
	      conn.close();
	}	
	}
