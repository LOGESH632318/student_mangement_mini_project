package mini_project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;





public class student {
	Scanner s1 =new Scanner(System.in);
	int sid,cfee,spaid,sbal=0,c1;
	int id=0;
	ArrayList<home> al=new ArrayList<home>();
	long sphone;
	String name,scourse;
	String[] course	= {"1.java","2.python","3.dot net","4.Ai","5.machine learnig"};
	
	public int gen() {
	    Random r = new Random( System.currentTimeMillis() );
	    return 10000 + r.nextInt(20000);
	}
	
	public void student() {
	System.out.println("-------------------------");
	System.out.println("Welcome To Student portal");
	System.out.println("-------------------------\n");
	System.out.println("Enter the below details to enroll course\n");
	System.out.println("Enter The Name:");
	name=s1.next();
	System.out.println("Enter Mobile Number:");
	sphone=s1.nextLong();
	int n = course.length;
	System.out.println("-----------------");
	System.out.println("Available Courses");
	System.out.println("-----------------");
	
	for(int i=0;i<n-1;i++) {
		
		System.out.println(course[i]);
	}
	System.out.println("Enter The choice:");
	c1=s1.nextInt();
	if(c1==1) {
		scourse="Java";
		System.out.println("You're Selected Java Course\nFees for java course 10000");
		System.out.println("Enter The Amount To Pay:");
		spaid=s1.nextInt();
		sbal = 10000-spaid;
		System.out.println("Your Balance For Course Is "+sbal+"\n please note balance amount should be paid with in 30 days");
		
		
	}
	else if(c1==2) {
		scourse="python";
		System.out.println("You're Selected Python Course\nFees for java course 10000");
		System.out.println("Enter The Amount To Pay:");
		spaid=s1.nextInt();
		sbal = 10000-spaid;
		System.out.println("Your Balance For Course Is "+sbal+"\n please note balance amount should be paid with in 30 days");
		
		
	}
	else if(c1==3) {
		scourse="dot net";
		System.out.println("You're Selected dot net Course\nFees for java course 10000");
		System.out.println("Enter The Amount To Pay:");
		spaid=s1.nextInt();
		sbal = 10000-spaid;
		System.out.println("Your Balance For Course Is "+sbal+"\n please note balance amount should be paid with in 30 days");
		
		
	}
	else if(c1==4) {
		scourse="Ai";
		System.out.println("You're Selected Ai Course\nFees for java course 10000");
		System.out.println("Enter The Amount To Pay:");
		spaid=s1.nextInt();
		sbal = 10000-spaid;
		System.out.println("Your Balance For Course Is "+sbal+"\n please note balance amount should be paid with in 30 days");
		
		
	}
	else if(c1==5) {
		scourse="machine learning";
		System.out.println("You're Selected machine learning Course\nFees for java course 10000");
		System.out.println("Enter The Amount To Pay:");
		spaid=s1.nextInt();
		sbal = 10000-spaid;
		System.out.println("Your Balance For Course Is "+sbal+"\n please note balance amount should be paid with in 30 days");
		
		
	}
	else {
		System.out.println("Please Try Again");
	}
	home s2=new home();
	id=s2.gen();
	
	
	
	System.out.println("--------------");
	System.out.println("Student Detail");
	System.out.println("--------------");
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Mobile:"+sphone);
	System.out.println("Course:"+scourse);
	System.out.println("Fees paid:"+spaid);
	System.out.println("Balance Fees Due:"+sbal);
	System.out.println("\nWelcome "+name);
	System.out.println("Thank You For Enrolling course...\nsoon You Will Contacted By Our Technical Team :)");
	System.out.println("*********************************\n");
	
	

}
}

