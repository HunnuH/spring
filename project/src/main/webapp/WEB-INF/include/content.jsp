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
	 .carousel-inner img {
      width: 60%; 
      margin: auto;
      min-height:100px;
    }
    footer {
      background-color: #f2f2f2;
      padding: 10px;
    }
</style>
<title>Insert title here</title>
</head>
<body>
<div>
<div id="myCarousel" class="carousel slide" data-ride="carousel">

    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
    </ol>

    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="../images/x3.jpg" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

      <div class="item ">
        <img src="../images/x2.jpg" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>
    </div>
    
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
<hr>

<div class="container text-center">    
 	 <div  class="col-lg-9">
 	 	<div class="row" >
 		    <div class="col-lg-4" >
		     	 <table class="table table-striped table-bordered table-hover table-condensed">
		    <thead>
		     	 <tr>
		        	<th>공지사항</th>
		     	 </tr>
		    </thead>
		    <tbody>
			      <tr align="left">
			        <td><a href="#">1</a></td>
			      </tr>
			      <tr align="left">
			        <td><a href="#">2</a></td>
			      </tr>
			      <tr align="left">
			        <td><a href="#">3</a></td>
			      </tr>
		    </tbody>
		  </table>
		    </div>
		    
		    <div class="col-lg-4"> 
		     	 <table class="table table-striped table-bordered table-hover table-condensed">
		    <thead>
		     	 <tr>
		        	<th>정보</th>
		     	 </tr>
		    </thead>
		    <tbody>
			      <tr align="left">
			        <td ><a href="#">1</a></td>
			      </tr>
			      <tr align="left">
			        <td><a href="#">2</a></td>
			      </tr>
			      <tr align="left">
			        <td><a href="#">3</a></td>
			      </tr>
		    </tbody>
		  </table>
		    </div>
		    
		     <div class="col-lg-4"> 
		      	 <table class="table table-striped table-bordered table-hover table-condensed">
		    <thead>
		     	 <tr>
		        	<th>자유게시판</th>
		     	 </tr>
		    </thead>
		    <tbody>
			      <tr align="left">
			        <td ><a href="#">1</a></td>
			      </tr>
			      <tr align="left">
			        <td><a href="#">2</a></td>
			      </tr>
			      <tr align="left">
			        <td><a href="#">3</a></td>
			      </tr>
		    </tbody>
		  </table>    
		    </div><br/>
		    
		   </div>  
		   <div class="row">
	  			<table class="table table-striped table-bordered table-hover table-condensed">
			    <thead>
			     	 <tr>
			        	<th  colspan="2">수선후기</th>
			     	 </tr> 
			    </thead>
			    <tbody>
				      <tr align="center">
				        <td ><a href="http://www.naver.com"><img src="../images/c1.jpg" width="200" height="200" ></a></td>
				        <td><a href="#"><img src="../images/c2.jpg"  width="200" height="200"></a></td>
				      </tr>
				       <tr align="center">
				        <td><a href="#"><img src="../images/c3.jpg" width="200" height="200" ></a></td>
				        <td><a href="#"><img src="../images/c4.jpg" width="200" height="200"></a></td>
				      </tr>
			    </tbody>
			  </table>
		</div> 
		
	 </div>
    	<div class="col-sm-3" >
	      <div class="well" >
	        	<a href="http://www.naver.com"><img src="../images/q1.jpg" width="200" height="600" ></a>
	      </div>
      	</div>
      
 
</div><br>

<footer class="container-fluid text-center">
  <p align="left" style="font-size: 20pt">Multi Campus</p>
  <p align="left">Semi - project</p>
</footer>
</div>
</body>
</html>





