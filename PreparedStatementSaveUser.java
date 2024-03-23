package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementSaveUser {

	public static void main(String[] args) throws Exception, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		PreparedStatement preparedstatement = con.prepareStatement("insert into Student values(?,?,?,?,?)");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the id");
		int id = scan.nextInt();
		System.out.println("please enter the student_name");
		String student_name = scan.next();
		System.out.println("please enter a branch");
		String branch = scan.next();
		System.out.println("please enter a grade");
		int grade = scan.nextInt();
		System.out.println("please enter a section");
		String section = scan.next();
		
		
		preparedstatement.setInt(1,id);
		preparedstatement.setString(2,student_name);
		preparedstatement.setString(3,branch);
		preparedstatement.setInt(4,grade);
		preparedstatement.setString(5,section);
		
		//Execute a query
		preparedstatement.execute();
		
		//close the connection
		con.close();
		System.out.println("data saved sucussfully with preparedstatement");
		
		

	}

}
