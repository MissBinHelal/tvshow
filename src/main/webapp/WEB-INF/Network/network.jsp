<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Add Network</title>
</head>
<body>

<form:form method="POST"
          action="/Network/new" modelAttribute="network">
           
          <form:label path="name">Name:</form:label>
                             <form:input path="name"/>
            <td><input type="submit" value="Submit"/></td>
        </form:form>
          

</body>
</html>