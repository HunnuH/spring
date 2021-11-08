<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
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
</style>
</head>
<body>
	<div>
	<tiles:insertAttribute name="top"></tiles:insertAttribute>
	</div>
	<div style="background-color: #edeef1;padding: 20px;height: 800px" id="main">
		<tiles:insertAttribute name="content"></tiles:insertAttribute>
	</div>
</body>
</html>