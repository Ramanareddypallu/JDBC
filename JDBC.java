package jdbcm8;

import java.sql.*;


public class JDBC {

	public static void main(String[] args) throws Exception {
		// TODO // Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. Establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		// 3. create a statement
		Statement statement = connection.createStatement();
		// 4. Execute a query
		ResultSet rs=statement.executeQuery("select * from student where idstudent=101");
		rs.next();
		int id=rs.getInt("idstudent");
		String name=rs.getString("student Name");
		String sec=rs.getString("section");
		int scr=rs.getInt("score");
		System.out.println(id+" "+name+" "+sec+" "+scr);
		//5. close the connection
		statement.close();
		connection.close();
		System.out.println("data saved successfully");

	}

}
