package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.CallableStatement;

public class CallableStatementSaveStudent {

	public static void main(String[] args) throws Exception {
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
        
		CallableStatement callableStatement = con.prepareCall("call savedstudent(109,'lava','mech',8,'b')");
		
		callableStatement.execute();
		
		con.close();
		System.out.println("data saved succussfully with cs");
	}

}
