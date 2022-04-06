package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModelGet {
	public void get(MarkSheetBean bean) throws Exception {
Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","ROOT");
		conn.setAutoCommit(false);
		
		PreparedStatement ps =  conn.prepareStatement("select * from marksheet where rollno=?");
		ps.setString(1, bean.getRollno());
		
		ResultSet rs = ps.executeQuery();
		conn.commit();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
			System.out.println(rs.getString(7));
			
			
		
		}
		rs.close();
		ps.close();
		conn.close();
			}
	}

