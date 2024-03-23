package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDeleteUser {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		PreparedStatement preparedStatement = con.prepareStatement("delete from student where id=?");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a id");
		int id = scan.nextInt();
		
		preparedStatement.setInt(1,id);
		
		preparedStatement.execute();
		
		con.close();
		System.out.println("data sucussfully deleted with ps");
		
		

	}

}
