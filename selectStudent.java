package jdbcm8;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class selectStudent {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","Ramana143@");
		
		Statement state = con.createStatement();
		
		ResultSet result = state.executeQuery("select * from student where id=102");
        while(result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
		}
		
		con.close();
		System.out.println("succussfully fetched a student data");
	}

}
