package MarksheetJDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception {
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
		 ps.setInt(7,bean.getMaths());
		 
		 int i = ps.executeUpdate();
		 conn.commit();
		 System.out.println(i+"Insert");
		 conn.close();
		 ps.close();
	}
	
	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","ROOT");
		 conn.setAutoCommit(false);
		 PreparedStatement ps = conn.prepareStatement("Update MarkSheet set Lname =? where id =?");
		 
		 ps.setInt(2, bean.getId());
		 ps.setString(1, bean.getlName());
		 
		 int i = ps.executeUpdate();
		 conn.commit();
		 System.out.println(i+"Update");
		 conn.close();
		 ps.close();
	}
	public void Delete(MarksheetBean bean) throws Exception {
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
   public ArrayList getmaritList() throws Exception{
	   Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","ROOT");
		 conn.setAutoCommit(false);
		 PreparedStatement ps = conn.prepareStatement("Select *,(phy+cham+maths) as total,(phy+cham+maths)/3 as percentage from marksheet where phy>40 and cham>40 and maths>40 order by (phy+cham+maths)/3 desc limit 10");
    
		 ResultSet rs = ps.executeQuery() ;
         
		 ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		 while (rs.next()) {
			 MarksheetBean bean1= new MarksheetBean();
			 bean1.setId(rs.getInt(1));
			 bean1.setRollno(rs.getString(2));
			 bean1.setfName(rs.getString(3));
			 bean1.setlName(rs.getString(4));
			 bean1.setPhy(rs.getInt(5));
			 bean1.setCham(rs.getInt(6));
			 bean1.setMaths(rs.getInt(7));
			 list.add(bean1);
			 
		}
		 conn.commit();
		conn.close();
		ps.close();
		return list;
	} 
   public ArrayList search() throws Exception {
	   Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","ROOT");
		 conn.setAutoCommit(false);
		 PreparedStatement ps = conn.prepareStatement("Select * from marksheet");
   
		 ResultSet rs = ps.executeQuery() ;
        
		 ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		 while (rs.next()) {
			 MarksheetBean bean1= new MarksheetBean();
			 bean1.setId(rs.getInt(1));
			 bean1.setRollno(rs.getString(2));
			 bean1.setfName(rs.getString(3));
			 bean1.setlName(rs.getString(4));
			 bean1.setPhy(rs.getInt(5));
			 bean1.setCham(rs.getInt(6));
			 bean1.setMaths(rs.getInt(7));
			 list.add(bean1);
			 
		}
		 conn.commit();
		conn.close();
		ps.close();
		return list;
	} 

   
public ArrayList<MarksheetBean> get(String rollno) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","ROOT");
	 conn.setAutoCommit(false);
	 PreparedStatement ps = conn.prepareStatement("Select * from marksheet where rollno=?");
  ps.setString(1, rollno);
	 ResultSet rs = ps.executeQuery() ;
	 ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
	
	 MarksheetBean bean = null;
	 while(rs.next()) {
		  bean = new MarksheetBean();
		 bean.setId(rs.getInt(1));
		 bean.setRollno(" " +rs.getString(2));
		 bean.setfName(" "+rs.getString(3));
		 bean.setlName(" "+rs.getString(4));
		 bean.setPhy(rs.getInt(5));
		 bean.setCham(rs.getInt(6));
		 bean.setMaths(rs.getInt(7));
		 list.add(bean);
		 
	}
	    conn.commit();
		conn.close();
		ps.close();
		return list;
}
}