<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>semi_project</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    .navbar {
      margin-bottom: 10px;
      border-radius: 0;
      border-width: 15px;
      border-color : #222222;
    }
    .jumbotron {
      margin-bottom: 0;
    }
    
  </style>
</head>
<body  data-spy="scroll" data-target=".navbar" data-offset="50">
<div class="jumbotron"  style=" background-image: url('../images/q2.jpg' ) ; ">
  <div class="container text-center" >
    <h1 style="color:white;">비비디바비디부</h1>      
  </div>
</div>
<div id="main">
<nav class="navbar navbar-inverse navbar-fixed">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="http://localhost:8088/clientweb/project/web-main1.html">
					 <img alt="logo"src="../images/q1.png " width="60"></a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li style="font-size: 17pt">
						<a href="http://localhost:8088/clientweb/project/web_submain.html">Home</a></li>
						<li style="font-size: 17pt"><a href="#">전체글</a></li>
						<li style="font-size: 17pt"><a href="#">가입인사</a></li>

						<li class="dropdown" style="font-size: 17pt">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">자유게시판
								<span class="caret"></span>
						</a>
							<ul class="dropdown-menu">
								<li><a href="#">잡담</a></li>
								<li><a href="#">정보공유</a></li>
							</ul></li>

						<li class="dropdown" style="font-size: 17pt"><a
							class="dropdown-toggle" data-toggle="dropdown" href="#">정보<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">수선집 위치</a></li>
								<li><a href="#">가격 및 수선가능 의류</a></li>
							</ul></li>

					<li class="dropdown" style="font-size: 17pt"><a
							class="dropdown-toggle" data-toggle="dropdown" href="#">후기 <span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">수선 사진</a></li>
								<li><a href="#">기타 후기</a></li>
							</ul></li>

						<li class="dropdown" style="font-size: 17pt"><a
							class="dropdown-toggle" data-toggle="dropdown" href="#">수선 대행<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">대행신청</a></li>
								<li><a href="#">정보수정</a></li>
								<li><a href="#">대행취소</a></li>
								<li><a href="#">조회</a></li>
							</ul></li>

						<li class="dropdown" style="font-size: 17pt"><a
							class="dropdown-toggle" data-toggle="dropdown" href="#">Q&A<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">수선Q&A</a></li>
								<li><a href="#">광고Q&A</a></li>
								<li><a href="#">문의 및 건의사항</a></li>
							</ul></li>

						<li class="dropdown" style="font-size: 17pt"><a
							class="dropdown-toggle" data-toggle="dropdown" href="#">광고<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">광고신청</a></li>
								<li><a href="#">광고취소</a></li>
							</ul></li>

						<li style="font-size: 17pt"><a href="#">공지사항</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
								Login</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
</body>
</html>