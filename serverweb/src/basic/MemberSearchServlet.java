package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;
import member.MemberDTO;

@WebServlet(name = "search", urlPatterns = { "/member/search.do" })
public class MemberSearchServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//클라이언트 요청정보 추출
		String action = request.getParameter("action");
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> userlist =  null;
		if(action.equals("SEARCH")) {
			String addr = request.getParameter("search");
			userlist = dao.search(addr);
		}else {
				userlist = dao.getMemberList();
		}
		//데이터공유
		request.setAttribute("userlist", userlist);
		//요청재지정
		RequestDispatcher rd = request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
	}

}
