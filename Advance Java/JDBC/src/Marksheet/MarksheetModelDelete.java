package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModelDelete {
	public void Delete(MarkSheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","ROOT");
		 conn.setAutoCommit(false);
		 PreparedStatement ps = conn.prepareStatement("Delete from marksheet where id =?");
		 
		 ps.setInt(1, bean.getId());
		 
		 
		 int i = ps.executeUpdate();
		 conn.commit();
		 System.out.println(i+"Delete");
		 conn.close();
		 ps.close();
	}
}
