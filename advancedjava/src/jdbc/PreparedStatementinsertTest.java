package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class PreparedStatementinsertTest {
		public static void main(String[] args) {
			PreparedStatementinsertTest obj = new PreparedStatementinsertTest();
			Scanner key = new Scanner(System.in);
			System.out.print("아이디: ");
			String id = key.next();
			System.out.print("패스워드: ");
			String pass = key.next();
			System.out.print("성명: ");
			String name = key.next();
			System.out.print("주소: ");
			String addr = key.next();
			System.out.print("부서번호: ");
			String deptno = key.next();
			obj.insert(id, pass, name, addr, deptno);
		}
		public void insert(String id, String pass, String name, String addr, String deptno) {
			String url = "jdbc:oracle:thin:@192.168.0.63:1521:xe";
			String user = "scott";
			String password = "tiger";
			StringBuffer sql = new StringBuffer();
			sql.append("insert into member values('"+id+"','"+pass+"','"+name+"','"+addr+"', 1000,'"+deptno+"')");
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver succes");
				con = DriverManager.getConnection(url,user,password);
				System.out.println("Connection succes" + con);
				stmt = con.createStatement();
				System.out.println("statement succes");
				rs = stmt.executeQuery(sql.toString());
				System.out.println("add succes");
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

