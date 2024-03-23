package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class getConnectionConcept {
     public static void main(String[] args) throws ClassNotFoundException, SQLException{
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
    	 Statement statement = connection.createStatement();
    	 statement.execute("insert into student values(107,'waste','civil',8.88,'b')");
    	 connection.close();
    	 System.out.println("data saved successfully with different getConnection concept");
     }
	
}
