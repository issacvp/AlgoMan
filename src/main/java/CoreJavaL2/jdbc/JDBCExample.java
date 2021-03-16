package CoreJavaL2.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {

	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:file:c:/project/h2db";
	static final String USER = "sa";
	static final String PASS ="";
	
	public static void main(String[] args) {
		Connection connection  = null;
		Statement statement = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to DB");
			connection = DriverManager.getConnection(DB_URL, USER,PASS);
			System.out.println("Creating statement");
			statement = connection.createStatement();
			String sql = "SELECT id, first, last, age FROM emp";
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");
				System.out.println("ID:"+id+", Age:"+age+", First:"+first+", Last:"+last);
			}
			
			/*
			 First create stored procedure in H2 with below code
			 
CREATE ALIAS GET_NET_SALARY AS  $$
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;
@CODE
ResultSet getNetSalary(final Connection conn) throws SQLException
{
  final Collection<String> records = new HashSet<String>();
  // get records without validity information
  StringBuffer sql = new StringBuffer();
  sql.append("SELECT ID, SAL+COMM GROSS, (SAL+COMM) - IT NET FROM EMP ");
  PreparedStatement ps = conn.prepareStatement(sql.toString());  
  return ps.executeQuery();
}
$$;
			 
	
	Then 
			 CallableStatement cStmt = connection.prepareCall("CALL GET_NET_SALARY()");
			if(cStmt.execute()) {
				ResultSet rs = cStmt.getResultSet();
				while (rs.next()) {
					int id = rs.getInt("id");
					double gross = rs.getDouble("gross");
					double net = rs.getDouble("net");
					System.out.println("ID:"+id+" gross:"+gross+", net:"+net);
				}
			}
			 */
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing statements and connections ");
			if (statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
