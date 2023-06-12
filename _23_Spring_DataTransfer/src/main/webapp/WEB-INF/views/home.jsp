<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<style>
		div > p {
			display: inline-block;
			margin-left: 10px;
		}
	</style>
</head>
<body>
<form action="/insertName.do" method="post">
	<input type="text" name="name">
	<input type="text" name="tel">
	<input type="submit" value="전송">
</form>
<div>
	<c:forEach items="${nameList }" var="aaa" varStatus="status">
	<div>
		<c:if test="${aaa.name == '고기천' }">
			<p style="color:blue;">${status.count }</p>
			<p style="color:blue;">${status.index }</p>
			<p style="color:blue;">${aaa.name }</p>
			<p style="color:blue;">${aaa.tel }</p>
		</c:if>
		<c:if test="${aaa.name != '고기천' }">
			<p>${status.count }</p>
			<p>${status.index }</p>
			<p>${aaa.name }</p>
			<p>${aaa.tel }</p>
		</c:if>
	</div>
	</c:forEach>
</div>
</body>
</html>
