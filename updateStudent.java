package jdbcm8;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class updateStudent {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		Statement statement = connection.createStatement();
		
		statement.execute("update student set section='b',branch='ece',grade=8 where id=107");
		
		connection.close();
		System.out.println("data updated succussfully");
       

	}

}
