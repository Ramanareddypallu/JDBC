package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUpdateUser {

	public static void main(String[] args) throws Exception, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		PreparedStatement preparedStatement = con.prepareStatement("update student set id=?,student_name=?,branch=?,grade=?,section=? where id=106");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a id");
		int id = scan.nextInt();
		System.out.println("enter a student_name");
		String student_name = scan.next();
		System.out.println("enter a branch");
		String branch = scan.next();
		System.out.println("enter a grade");
		int grade = scan.nextInt();
		System.out.println("enter a section");
		String section = scan.next(); 
		
		
		preparedStatement.setInt(1,id);
		preparedStatement.setString(2,student_name);
	    preparedStatement.setString(3,branch);
		preparedStatement.setInt(4,grade);
		preparedStatement.setString(5,section); 
		
		
		preparedStatement.execute();
		
		con.close();
		System.out.println("data sucussfully updated with ps");
		
		

	}

}
