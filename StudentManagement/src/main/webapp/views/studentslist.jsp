<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>studentslist (${studentlist.size()})</h2>
<table> 
	<c:forEach var="x" items="${studentlist}">
	<tr>
          <td>${x.getName()}</td>          		
                    	
	</tr>
	 </c:forEach>
	 </table>
</body>
</html>