package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertTest {
	public static void main(String[] args) {
	// C - insert,  R - select,  U - update,  D- delete
	// C - insert,  L - select(전체목록조회),  R - select(조건 정보 조회), 
	// U - update,  D - delete
		String url = "jdbc:oracle:thin:@192.168.0.63:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("insert into member values('lee','1234','이민호','인천', 1000,'100')");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver succes");
			//2. DB서버 커넥션
		con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection succes" + con);
			//3. SQL을 실행하는 기능을 갖고 있는 객체 statement생성
		stmt = con.createStatement();
		System.out.println("statement 객체 생성완료");
			//4. SQL실행
		rs = stmt.executeQuery(sql.toString());
		System.out.println("삽입성공-"+rs);
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
