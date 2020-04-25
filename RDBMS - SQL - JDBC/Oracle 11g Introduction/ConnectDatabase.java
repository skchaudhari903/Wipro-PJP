import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabase {
	public static void main(String[] args) throws SQLException
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sarthak05");
		Statement stmt =conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" "+rs.getString(2));
		}
		conn.close();
	}
}
