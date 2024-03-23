package jdbcm8;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class deleteStudent {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		Statement statement = connection.createStatement();
		
		statement.execute("delete from student where id=105");
		
		connection.close();
		System.out.println("data succussfully deleted");

	}

}
