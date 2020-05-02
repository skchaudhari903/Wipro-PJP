/*Write a java program that connects to oracle database, queries the inbuilt table “emp” and 
displays the first two columns (empno using column index and ename using column name ) of all the rows.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment01 {
	public static void main(String args[]) throws SQLException {
	
	       String url = "jdbc:oracle:thin:@localhost:1521/orcl"; 
		   
		Statement stmt;
		ResultSet rs;
	      	Connection conn;
			
	       
		try {
	  		Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException ex) {
	   		System.out.println("Error: unable to load driver class!");
	   		System.exit(1);
		}
	    
	        try{
	            conn = DriverManager.getConnection(url,"hr", "hr");
	            System.out.println("Connection Established successfully.");
			        
	            stmt = conn.createStatement();
	            rs = stmt.executeQuery("Select EMPLOYEE_ID, LAST_NAME from employees");
	            while(rs.next()){
	              System.out.println(rs.getInt(1) + "\t" + rs.getString("LAST_NAME"));
	            }
	              conn.close();
		}
	    	catch(Exception e){
	      		System.out.println("Exception: " + e);
	    	}
	}

}
