<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>index.jsp</title>
</head>
<body>
<h1>
INDEX
</h1>

<P>  안녕! </P>


<c:forEach var="t" items="${test}">
 <p>${t.userid} ${t.userid}</p>
</c:forEach>

<a href="login">로구잉</a>
<a href="write">롸잇</a>
</body>
</html>
