package mini_project;

import java.sql.*;

import java.util.Scanner;



public class home extends student{
	public void welcomemsg() {
		System.out.println("-----------------------------------");
		System.out.println("Welcome To Student Mangement System");
		System.out.println("-----------------------------------\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		home std= new home();
		Scanner sc =new Scanner(System.in);
		std.welcomemsg();
		int ch;  
        do {  
           
        	System.out.println("-------------------");
        	System.out.println("     HOME PAGE     ");
        	System.out.println("-------------------");
        	System.out.println("1.Admin\n2.Student\n3.Quit");  
        	System.out.println("-------------------");
            System.out.println("Enter your choice: ");
            
            ch = sc.nextInt();
            switch(ch){
            case 1:
            	admin a = new admin();
            	a.admin();
            	
            	break;
            case 2:
            	student s=new student();
            	s.student();
            	Connection con = null;

        	    String url = "jdbc:mysql://localhost:3306/student";
        	    String username = "root";
        	    String password = "root";

        	    try {
        	      Class.forName("com.mysql.cj.jdbc.Driver");
        	      con = DriverManager.getConnection(url, username, password);
        	      PreparedStatement stmt=con.prepareStatement("insert into student values (?,?,?,?,?,?)");
        	      stmt.setInt(1, s.id);
        	      stmt.setString(2,s.name);
        	      stmt.setLong(3, s.sphone);
        	      stmt.setString(4,s.scourse);
        	      stmt.setInt(5, s.spaid);
        	      stmt.setInt(6, s.sbal);
        	      
        	      int i=stmt.executeUpdate();
        	      System.out.print(i+ " record inserted");
        	      
        	      
        }catch(Exception e) {
        	System.out.print(e);
        }
        	
            	break;
            case 3:
            	System.out.println("Thank You--- :)");
            	break;
            }
                  
            }  
            while (ch != 3); 

	}

}
