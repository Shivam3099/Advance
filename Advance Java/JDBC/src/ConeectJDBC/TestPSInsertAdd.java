package ConeectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPSInsertAdd {
  public static void main(String[] args) throws Exception {
	  tsetUpdate();
}

public static void tsetUpdate() throws Exception {
Class.forName("com.mysql.jdbc.Driver").newInstance();
	
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raystech","root","ROOT");
int id=12;
String Fname = "sanjay";
String Lname = "mandloi";
int salary = 40000;
int dep_id = 3;

PreparedStatement ps =  conn.prepareStatement("?,?,?,?,?");
String s = "insert into employee values("+id+",'"+Fname+",'"+Lname+"',"+salary+","+dep_id+")"; 

int i = ps.executeUpdate(s);

System.out.println(i+"Insert");

  ps.close();
  conn.close();
}	
}
