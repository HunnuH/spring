package jdbc.exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DeptinsertTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@192.168.0.63:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		StringBuffer sql1 = new StringBuffer();
		sql.append("insert into mydept values('200','ÀÎ»çÆÀ','10Ãþ','hong')");
		sql1.append("insert into mydept values('300','ÃÑ¹«ºÎ','10Ãþ','hong')");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Statement stmt1 = null;
		ResultSet rs1 = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver succes");
		con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection succes");
		
		stmt = con.createStatement();
		System.out.println("statement succes");
		rs = stmt.executeQuery(sql.toString());
		System.out.println("Add succes");
		
		stmt1 = con.createStatement();
		System.out.println("statement succes");
		rs1 = stmt1.executeQuery(sql1.toString());
		System.out.println("Add succes");
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
				if(rs1!=null) rs1.close();
				if(stmt1!=null) stmt1.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
