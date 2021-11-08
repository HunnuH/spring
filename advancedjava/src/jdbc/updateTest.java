package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updateTest {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@192.168.0.63:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("update member set addr ='����' ");
		sql.append("where addr= '����Ư����' ");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver succes");
		 con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection succes");
		 stmt = con.createStatement();
		System.out.println("statement succes");
		rs = stmt.executeQuery(sql.toString());
		System.out.println("result succes");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
