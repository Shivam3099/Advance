package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




public class MarksheetModel {
	public void add(MarkSheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","ROOT");
		 conn.setAutoCommit(false);
		 PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?)");
		 
		 ps.setInt(1, bean.getId());
		 ps.setString(2, bean.getRollno());
		 ps.setString(3,bean.getfName());
		 ps.setString(4,bean.getlName());
		 ps.setInt(5,bean.getPhy());
		 ps.setInt(6,bean.getCham());
		 ps.setInt(7,bean.getMath());
		 
		 int i = ps.executeUpdate();
		 conn.commit();
		 System.out.println(i+"Insert");
		 conn.close();
		 ps.close();
	}

}

