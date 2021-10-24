<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <title>registration!</title>
  </head>
<body>
 <h1 style="text-align: center;color:yellow;background-color:navy;" >${head }</h1>

 <div class="row">
 <div class=col-md-2></div>
 	<div class="col-md-7" style="margin-top: 15px">
 	<table class="table table-striped table-bordered">
  <thead>
    <tr class="text-center">
      <th scope="col">Id</th>
      <th scope="col">Product_Name</th>
      <th scope="col">Price</th>
      <th scope="col">Menufec_Id</th>

        <th colspan="2">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var= "item" items="${all}">
  <tr class="text-center">
  	<td>${item.id }</td>
    <td>${item.productName }</td>
    <td>${item.price }</td>
    <td>${item.menu_id }</td>
     
     <td>
     <a href="editEmployee?id=${item.id}"><i class="fas fa-pen-nib text-warning" style="font-size: 30px;"></i></a>
  </td>
   
     <td>
     <a style="color: white"" href="deletuser?id=${item.id}"><i class="fas fa-trash-alt text-danger" style="font-size: 30px;"></i></a></td>
  </tr>
  </c:forEach>
   
 
  </tbody>
</table>
<div class="text-center" >
<button  class="btn btn-primary " style="font-size: 20px;"><a style="color: white" href="registration"><i class="fas fa-plus-circle" style="font-size: 25px;"></i> Add</a></button>
<button  class="btn btn-success " style="font-size: 20px;"><a style="color: white" href="report"> Report</a></button>
</div>
 	</div>
 </div>





    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>