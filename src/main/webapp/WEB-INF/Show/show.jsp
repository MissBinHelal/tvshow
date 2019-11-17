<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<style>
#shows {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#shows td, #shows th {
  border: 1px solid #ddd;
  padding: 8px;
  color: black;
}

#shows tr:nth-child(even){background-color: #f2f2f2;}

#shows tr:hover {background-color: #ddd;}

#shows th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
<meta charset="windows-1256">
<title>TV Show</title>
</head>
<body>
<table id="shows">
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>Network</th>
            <th>Show</th>
            <th>Edit</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><c:out value="${tvshow.title}"/></td>
            <td><c:out value="${tvshow.description}"/></td>
            <td><c:out value="${tvshow.language}"/></td>
            <td><c:out value="${tvshow.network}"/></td>
            <td><a href="/show/${tvshow.id}/delete">Delete</a></td>
            <td><a href="/show/edit/${tvshow.id}">Edit</a></td>

        </tr>
       
    </tbody>
</table>
</body>
</html>