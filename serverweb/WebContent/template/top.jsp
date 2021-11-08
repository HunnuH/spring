<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		</head>
		<body>
		
			<div class="container">
				<div class="row">
				<h1>HRM System</h1>
				<nav class="navbar navbar-inverse">
					
						<ul class="nav navbar-nav">
							<li><a href="#" class=active>HOME</a></li>
							<li class="divider-vertical"></li>
							<li><a href="#">부서관리</a></li>
							<li class="divider-vertical"></li>
							<li><a href="#">인사관리</a></li>
							<li><a href="/serverweb/member/login.jsp">로그인</a></li>
						</ul>
						<form class="navbar-form pull-right">
							<input type="text" name="search">
							<input type="submit" value="검색">
						</form>
					
				</nav>
				</div>
				<!-- <br/><br/><br/><br/> -->
		</div>
	</body>
</html>