<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>

<!DOCTYPE html>
<html>

	<head>
		<title>Student Registration Form</title>
	</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
	FirstName : <form:input path ="firstName" />
	
	<br><br>
	
	LastName : <form:input path ="lastName" />
	
	<br><br>
	Country :
	
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
	 </form:select>
	
	<br><br>
	Java <form:radiobutton path="favoriteLanguage" value="Java"/>
	C# <form:radiobutton path="favoriteLanguage" value="C#"/>
	PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
	Scala <form:radiobutton path="favoriteLanguage" value="Scala"/>
	
	<br><br>
	Operating Systems :
	
	Linux : <form:checkbox path="operatingSystems" value="Linux" />
	Windows : <form:checkbox path="operatingSystems" value="Windows" />
	Ubantu : <form:checkbox path="operatingSystems" value="Ubantu" />
	Mac : <form:checkbox path="operatingSystems" value="Mac" />
	
	<br><br>
	<input type="submit" value="Submit" />
	
	</form:form>
</body>
</html>