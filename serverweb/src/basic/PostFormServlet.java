package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mypost", urlPatterns = { "/mypost.do" })
public class PostFormServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String pass = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String favorites = request.getParameter("item");
		
		PrintWriter out = response.getWriter();
		out.print("<h2>아이디 : "+id+"</h2>");
		out.print("<h2>이름 : "+name+"</h2>");
		out.print("<h2>패스워드 : "+pass+"</h2>");
		out.print("<h2>성별 : "+gender+"</h2>");
		out.print("<h2>직업 : "+job+"</h2>");
		out.print("<h2>선호 : "+favorites+"</h2>");
	}
}
