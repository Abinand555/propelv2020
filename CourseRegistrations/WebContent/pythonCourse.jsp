<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!--Link Button  -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- Link Button  -->


<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<!-- Style(CSS) for header -->
<style>
/* Style the body */
body {
  font-family: Arial;
  margin: 0;
}

/* Header/Logo Title */
.header {
  padding: 70px;
  text-align: center;
  background: #1abc9c;
  color: white;
  font-size: 30px;
}

/* Page Content */
.content {padding:20px;}
</style>
</head>
<body>

<div class="header">
  <h1>Course Registration</h1>
</div>

<h4>User</h4>
<br>
<h3>WELCOME <%=session.getAttribute("name") %></h3>
<br>
<h2>Java Course Details</h2>
<table class="table table-bordered">

<tr>
    <th>Course Name</th>
    <td>Python</td>
 </tr>
 
<tr>
    <th>Course Duration</th>
    <td>4 months</td>
 </tr>
 
 <tr>
    <th>Course Commencement Date</th>
    <td>2020-04-03</td>
 </tr>
 
 <tr>
    <th>Qualification Required</th>
    <td>Any degree</td>
 </tr>
 
 <tr>
    <th>Fees</th>
    <td>65,000</td>
 </tr>

</table>

<div class="w3-container">     <!-- LinkButton -->

<td><a href="welcome.jsp" class="w3-button w3-blue">Back</a></td>  <!-- Link button -->

<td><a href="inserttwo.jsp" class="w3-button w3-orange">Apply</a></td>  <!-- Link button -->

</div>  <!-- LinkButton -->
</body>
</html>