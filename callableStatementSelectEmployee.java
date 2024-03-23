package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.CallableStatement;

public class callableStatementSelectEmployee {

	public static void main(String[] args) throws Exception {
		
	    Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
        
		CallableStatement callableStatement = con.prepareCall("call select_employee(104)");
		
		ResultSet resultSet = callableStatement.executeQuery();
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
		}
        con.close();
        System.out.println("fetced a data succussfully with cs");
	}
}
