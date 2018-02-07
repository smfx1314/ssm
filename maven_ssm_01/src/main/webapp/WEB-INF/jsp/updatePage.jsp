<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户界面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user/updateUser" method="post">
		编号：<input type="text" name="id"  value="${user.id }">
		姓名：<input type="text" name="name" value="${user.name }">
		<input type="submit" value="确定修改">
	</form>
</body>
</html>