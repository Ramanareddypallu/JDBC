package jdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class preparedStatementUpdateEmployee {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		PreparedStatement preparedStatement = con.prepareStatement("update employee set employee_id=?,employee_name=?,employee_dept=? where employee_id=103");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a employee_id: ");
		int employee_id = scan.nextInt();
		System.out.println("Enter a employee_name ");
		String employee_name = scan.next();
		System.out.println("Enter a employee_dept ");
		String employee_dept = scan.next();
		
		preparedStatement.setInt(1,employee_id);
		preparedStatement.setString(2,employee_name);
		preparedStatement.setString(3,employee_dept);
		
		
		preparedStatement.execute();
		
		con.close();
		System.out.println("employee date update sucussfully with ps");
		
		

	}

}
