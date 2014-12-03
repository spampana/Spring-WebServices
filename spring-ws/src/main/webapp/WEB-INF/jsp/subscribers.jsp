<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Subscribers</h1>

<table>
	<tr>
		<td width="150">Id</td>
		<td width="150">Name</td>
		<td width="150">Email</td>
	</tr>
	<c:forEach items="${subscriptions}" var="subscription">
		<tr>
			<td><c:out value="${subscription.id}" /></td>
			<td><c:out value="${subscription.name}" /></td>
			<td><c:out value="${subscription.email}" /></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>