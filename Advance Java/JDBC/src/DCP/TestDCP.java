package DCP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDCP {
	 public static void main(String[] args) throws Exception{
		   for(int i =0; i<20;i++) {
			   
			   System.out.println(i);
	    testSelect();
	   
	   }
	   }
	   public static void testSelect() throws Exception{
	Connection conn = JdbcDataSource.getConnection();

	Statement stmt = conn.createStatement();

	ResultSet rs = stmt.executeQuery("Select * from marksheet");
	

	while(rs.next())
	{
	 System.out.print(rs.getString(1));
	 System.out.print("\t"+rs.getString(2));
	 System.out.print("\t"+rs.getString(3));
	 System.out.print("\t"+rs.getString(4));
	 System.out.print("\t"+rs.getString(5));
	 System.out.println("\t"+rs.getString(6));
	 System.out.println("\t"+rs.getString(7));
	 
	}

	stmt.close();
	conn.close();
	JdbcDataSource.closeConnection(conn);
	   }
}
