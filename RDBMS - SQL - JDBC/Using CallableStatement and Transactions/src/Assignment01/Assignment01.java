/*Create a stored procedure that calculates net salary of all the employees whose records are stored in table "emp".
The criteria for calculating net salary is as follows :
Gross salary = sal + comm.
Net Salary = gross salary - IT
If the employee's commission is null then IT is calculated as
IT =  10% of gross salary
else if the employees commission is less than 500, then IT is calculated as
IT =  15% of gross salary
else
IT = 20% of gross salary.
Develop a jdbc program that invokes this stored procedure by passing the empno. and in return gets the net salary of each employee. Display on screen the empno., ename and net salary of all the employees.
*/

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Assignment01 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		CallableStatement cstmt = null;		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "SELECT * FROM employees";
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int empno = rs.getInt("employee_id");
				String ename = rs.getString("first_name");
				double netSalary = 0;
				
				String sql2 = "{ call calculate_salary(?, ?) }";

				cstmt = conn.prepareCall(sql2);
				cstmt.setInt(1, empno);
				cstmt.registerOutParameter(2, Types.DOUBLE);
				cstmt.executeQuery();
				
				netSalary = cstmt.getDouble(2);
				
				System.out.println("empno: " + empno + ", ename: " + ename + ", net salary: " + netSalary);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error");
			stmt.close();
			cstmt.close();
			conn.close();
		}
	}

}
