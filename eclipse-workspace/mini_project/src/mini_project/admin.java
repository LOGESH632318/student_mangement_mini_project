package mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;



public class admin  {
	public void admin() {
	
		
		System.out.println("-----------------------");
		System.out.println("Welcome TO Admin portal");
		System.out.println("-----------------------\n");
	
		Connection con = null;

	    String url = "jdbc:mysql://localhost:3306/student";
	    String username = "root";
	    String password = "root";

	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      con = DriverManager.getConnection(url, username, password);
	      Statement stat=con.createStatement();
	      ResultSet rs=stat.executeQuery("select * from student");
	      System.out.println("***student details****");
	      ResultSetMetaData rsmd = null;
	      rsmd = rs.getMetaData();

	      System.out.println(rsmd.getColumnLabel(1)+ " "+rsmd.getColumnLabel(2)+ " "+rsmd.getColumnLabel(3)+ " "+rsmd.getColumnLabel(4)+ " "+rsmd.getColumnLabel(5)+ " "+rsmd.getColumnLabel(6)+ " ");
			 
	      while(rs.next())
	    	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
	      con.close();
	    	}catch(Exception e) {
	    		System.out.print(e);
	    	}
	
		System.out.println("\n\n********************************************\n");
	}
}
