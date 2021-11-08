package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertTest {
	public static void main(String[] args) {
	// C - insert,  R - select,  U - update,  D- delete
	// C - insert,  L - select(��ü�����ȸ),  R - select(���� ���� ��ȸ), 
	// U - update,  D - delete
		String url = "jdbc:oracle:thin:@192.168.0.63:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("insert into member values('lee','1234','�̹�ȣ','��õ', 1000,'100')");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver succes");
			//2. DB���� Ŀ�ؼ�
		con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection succes" + con);
			//3. SQL�� �����ϴ� ����� ���� �ִ� ��ü statement����
		stmt = con.createStatement();
		System.out.println("statement ��ü �����Ϸ�");
			//4. SQL����
		rs = stmt.executeQuery(sql.toString());
		System.out.println("���Լ���-"+rs);
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
