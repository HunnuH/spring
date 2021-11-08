package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;
import member.MemberDTO;

@WebServlet(name = "memberInsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String deptno = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		
		MemberDTO user = new MemberDTO(id ,pass, name, addr, deptno);
		MemberDAO dao = new MemberDAO();
		int result = dao.insert(user);
		
		PrintWriter out = response.getWriter();
		if(result >=1 ) {
			out.print("<h2>삽입성공</h2>");
		}else {
			out.print("<h2>삽입실패</h2>");
		}
	}
}
