<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<style>
input[type=text], input[type=password]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

small{
color:red;
}
</style>
<meta charset="windows-1256">
<title>TV Show</title>
</head>
<body>
<form:form method="POST"
          action="/show/new" modelAttribute="show">
           
          <form:label path="title">Title:</form:label>
                             <form:input path="title"/>
           <form:label path="description">Description:</form:label>
                             <form:input path="description"/>
           <form:label path="language">language:</form:label>
                             <form:input path="language"/>
           <form:label path="network">Network:</form:label>
                             <form:input path="network"/>
          
            <td><input type="submit" value="Submit"/></td>
        </form:form>
</body>
</html>