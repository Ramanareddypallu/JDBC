package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementSelectUser {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		PreparedStatement preparedStatement = con.prepareStatement("select * from student where id=?");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a id");
		int id = scan.nextInt();
		
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getInt(4));
			System.out.println(resultSet.getString(5));
			
		}
		
		con.close();
		System.out.println("fetched a data succussfully with ps");
		

	}

}
