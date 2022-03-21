<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Registration Step1</h1>
	<form:form action="student_forgot_registration_form" method="POST"
		modelAttribute="student">
		<pre>
SSC/8th Board:<select>
<option>-select-</option>
</select>
SSC/8th Hall Ticket Number:<input type="text">
Year of Passing:<input type="text">
Result Type:<select>
<option>-select-</option>
				<option>Grades</option>
				<option>Marks</option> 
</select>
<input type="submit" value="Proceed">

</pre>
	</form:form>
	<a href="home">Home</a>
</body>
</html>