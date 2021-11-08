<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		<body>
			<% String str = "java";
				  int size = str.length();
				  
				  %>
			  <h1>스크립트요소(스크립트릿, 표현식,태그를 함께 사용)</h1>
			  <% if(size>=5) { %>
				  		<h1>좋아요: <%=size %></h1>
				  		<img alt=" " src="/serverweb/images/x1.jpg"  width="500" height="500" >
				<% }else {%>
			  			<h1>싫어요: <%=size %></h1>
			  			<img alt=" " src="/serverweb/ima ges/q2.jpg"  width="500" height="500" >
	  			<% } %>
		</body>
</html>