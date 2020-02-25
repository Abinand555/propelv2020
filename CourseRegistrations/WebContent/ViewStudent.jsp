<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

<!--  -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


<!--  -->

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


<br>
<h3>WELCOME <%=session.getAttribute("name") %></h3>
<br>
<!--  -->


</head>
<body>
<form action="<%=request.getContextPath()%>/LogoutServlet" method="get">

<table class="table table-bordered">
<thead>
<tr>
						<th>RegNo</th>
						<th>StuName</th>
						<th>CourseSelected</th>
						<th>Gender</th>
						<th>Address</th>
						<th>EmailAddress</th>
						<th>Phone no</th>
						<th>Qualifiacation</th>

					</tr>
				</thead>

				<tbody>

					<c:forEach var="student" items="${listStudentKey}">

						<tr>
							<td><c:out value="${student.sid}" /></td>
							<td><c:out value="${student.sName}" /></td>
							<td><c:out value="Java" /></td>
							<td><c:out value="${student.gender}" /></td>
							<td><c:out value="${student.address}" /></td>
							<td><c:out value="${student.email}" /></td>
							<td><c:out value="${student.phoneNum}" /></td>
							<td><c:out value="${student.qual}" /></td>
							
								

						</tr>
					</c:forEach>

				</tbody>

			</table>
			
			<button type="submit">LOGOUT</button>
</form>			
</body>
</html>