package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.CallableStatement;

public class CallableStatementUpdateStudent {

	public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
        
		CallableStatement callableStatement = con.prepareCall("call updatestudent(109,'kikku','ece',8,'b')");

		callableStatement.execute();
				
		con.close();
		System.out.println("data update succussfully with cs");
	
	}

}
