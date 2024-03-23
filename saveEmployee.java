 package jdbcm8;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class saveEmployee {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		Statement statement = con.createStatement();
		
		statement.execute("insert into employee values(103,'sneha reddy','developer')");
		
		con.close();
		System.out.println("data sucussfully inserted in to employee");

	}

}
