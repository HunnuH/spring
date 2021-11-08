<%@page import="member.MemberDTO"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Random,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
				<h2>jsp에서 사용하는 스크립트 요소</h2>
				
				<h3>4.선언문</h3>
				<% int i =1000; %>
				<%! int i =2000; %>
				<%! public void test() {
							System.out.print("test");	
						}
				%>
				
				
				<h3>3. 표현식</h3>
				<% String str2 = "java progarming"; %>
				<h3> 표현식으로 작성하는 문자열의 길이 :<%= str2.length() %></h3>
				<h4><%=10 %></h4>
				<h4><%=10.5 %></h4>
				<h4><%="java" %></h4>
				<h4><%=true %></h4>
				<h4><%=10/4 %></h4>
				<h4><%=new Date().toString() %></h4>
				<h4><%=str2 %></h4>
				<h4><%=str2.charAt(5) %></h4>
				
				
				<h3>2. 스크립트릿 - 자바코드를 쓸수있는 스크립트 요소</h3>
					<% String str = new String("자바");
					      out.print("<h3>문자열의길이 :"+str.length()+"</h3>");
					      Random rand = null;
					      ArrayList list = null;
					      Date d = null;
					      MemberDTO dto = null;
					      %>
					      
			 <h3>1.주석문</h3>		      
		</body>
</html>