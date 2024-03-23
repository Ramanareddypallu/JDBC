package jdbcm8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementdeleteStudent {

	public static void main(String[] args) throws Exception {
		
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
	        
			CallableStatement callableStatement = con.prepareCall("call deletestudent(109)");
			
			callableStatement.execute();
			
			con.close();
			System.out.println("data saved succussfully with cs");

	}

}
