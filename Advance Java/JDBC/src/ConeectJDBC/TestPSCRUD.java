package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class TestPSCRUD {
   public static void main(String[] args) throws Exception {
	testSelect();
}

    public  static void testSelect() throws Exception{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
	
	PreparedStatement ps =  conn.prepareStatement("select * from employee");
	
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()) {
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		System.out.println(rs.getString(5));
	
	}
	rs.close();
	ps.close();
	conn.close();
		}

}
