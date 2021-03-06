package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarkSheetModelUpdate {
	public void update(MarkSheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","ROOT");
		 conn.setAutoCommit(false);
		 PreparedStatement ps = conn.prepareStatement("Update MarkSheet set Fname =? where id =?");
		 
		 ps.setInt(2, bean.getId());
		 ps.setString(1, bean.getfName());
		 
		 int i = ps.executeUpdate();
		 conn.commit();
		 System.out.println(i+"Update");
		 conn.close();
		 ps.close();
	}

}

