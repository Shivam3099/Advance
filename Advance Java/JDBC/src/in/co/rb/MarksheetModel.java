package in.co.rb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import MarksheetJDBC.MarksheetBean;

public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("Driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("password"));
		 conn.setAutoCommit(false);
		 PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?)");
		 
		 ps.setInt(1, bean.getId());
		 ps.setString(2, bean.getRollno());
		 ps.setString(3,bean.getfName());
		 ps.setString(4,bean.getlName());
		 ps.setInt(5,bean.getPhy());
		 ps.setInt(6,bean.getCham());
		 ps.setInt(7,bean.getMaths());
		 
		 int i = ps.executeUpdate();
		 conn.commit();
		 System.out.println(i+"Insert");
		 conn.close();
		 ps.close();
	}
}
