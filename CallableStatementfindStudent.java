package jdbcm8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementfindStudent {

	public static void main(String[] args) throws Exception {
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
        
		CallableStatement callableStatement = con.prepareCall("call findstudent(101)");

		
		ResultSet resultSet = callableStatement.executeQuery();
        while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getInt(4));
			System.out.println(resultSet.getString(5));
			
        }

		con.close();
		System.out.println("data fetched succussfully with cs");
	}

}
