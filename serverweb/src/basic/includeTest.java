package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDTO;
@WebServlet(name = "include", urlPatterns = { "/include.do" })
public class includeTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		System.out.println("include연습 - include서블릿");
		out.print("<h1>요청재지정연습 - redirect</h1>");
		
		//데이터 공유
		MemberDTO user = new MemberDTO("kang", "강동원");
		request.setAttribute("mydata", user);
		
		//요청재지정
		RequestDispatcher rd = request.getRequestDispatcher("/servletexam/resultpage.jsp");
		rd.include(request, response);
		out.print("<hr><hr><hr><hr><hr>");
		out.print("<h1>종료</h1>");
	}
}
