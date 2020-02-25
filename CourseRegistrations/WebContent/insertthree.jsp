<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	rel="stylesheet">
	
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


<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic);
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-font-smoothing: antialiased;
  -moz-font-smoothing: antialiased;
  -o-font-smoothing: antialiased;
  font-smoothing: antialiased;
  text-rendering: optimizeLegibility;
}

body {
  font-family: "Roboto", Helvetica, Arial, sans-serif;
  font-weight: 100;
  font-size: 12px;
  line-height: 30px;
  color: #777;
  background: #3EA99F;
}

.container {
  max-width: 400px;
  width: 100%;
  margin: 0 auto;
  position: relative;
}

#contact input[type="text"],
#contact input[type="date"],
#contact input[type="text"],
#contact input[type="text"],
#contact input[type="text"],
#contact input[type="text"],
#contact input[type="text"],
#contact button[type="submit"] {
  font: 400 12px/16px "Roboto", Helvetica, Arial, sans-serif;
}

#contact {
  background: #F9F9F9;
  padding: 25px;
  margin: 150px 0;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}

#contact h3 {
  display: block;
  font-size: 30px;
  font-weight: 300;
  margin-bottom: 10px;
}

#contact h4 {
  margin: 5px 0 15px;
  display: block;
  font-size: 13px;
  font-weight: 400;
}

fieldset {
  border: medium none !important;
  margin: 0 0 10px;
  min-width: 100%;
  padding: 0;
  width: 100%;
}

#contact input[type="text"],
#contact input[type="date"],
#contact input[type="text"],
#contact input[type="text"],
#contact input[type="text"],
#contact input[type="text"],
#contact input[type="text"],








#contact button[type="submit"] {
  cursor: pointer;
  width: 100%;
  border: none;
  background:  #43BFC7;
  color: #FFF;
  margin: 0 0 5px;
  padding: 10px;
  font-size: 15px;
}

#contact button[type="submit"]:hover {
  background: #43A047;
  -webkit-transition: background 0.3s ease-in-out;
  -moz-transition: background 0.3s ease-in-out;
  transition: background-color 0.3s ease-in-out;
}

#contact button[type="submit"]:active {
  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.5);
}

.copyright {
  text-align: center;
}

#contact input:focus,
#contact textarea:focus {
  outline: 0;
  border: 1px solid #aaa;
}

::-webkit-input-placeholder {
  color: #888;
}

:-moz-placeholder {
  color: #888;
}

::-moz-placeholder {
  color: #888;
}

:-ms-input-placeholder {
  color: #888;
}
</style>

</head>
<body>

<div class="bodycontainer">
	<form action="<%=request.getContextPath()%>/InsertServletThree" method="post">
		<div class="container">
		 <div class="form-group">


    <h3></h3>
    <h4></h4>
    
    <fieldset>
      <input placeholder="Your name" type="text" class="form-control" tabindex="1" name="stuname" required autofocus>
    </fieldset>
    
    <fieldset>
    <label>D.O.B</label>
    <input placeholder="Enter date of birth" type="date" class="form-control" id="birthday" name="birthday">
     </fieldset>
     
     
     <fieldset class="form-group">
				<label>Gender</label>
					 <input type="radio" id="male" name="gender" value="M">
					  <label for="male">M</label>
					  <input type="radio" id="female" name="gender" value="F">
					  <label for="female">F</label>
					  <input type="radio" id="other" name="gender" value="O">
					  <label for="other">O</label>
				</fieldset>
				
     <fieldset>
      <input placeholder="Your  Address" type="text" class="form-control" name="address"  required>
    </fieldset>
    
    <fieldset>
      <input placeholder="Your Email Address" type="text" class="form-control" name="email"  required>
    </fieldset>
    <fieldset>
      <input placeholder="Your Phone Number" type="text" class="form-control" name="phno"  required>
    </fieldset>
    <fieldset>
      <input placeholder="Enter qualification" type="text" class="form-control" name="qual"  required>
    </fieldset>
    
    <fieldset>
      <button name="submit" type="submit" class="form-control" id="contact-submit" data-submit="...Sending">Register</button>
    </fieldset>
    </div>
</div>
  </form>
</div>

</body>
</html>