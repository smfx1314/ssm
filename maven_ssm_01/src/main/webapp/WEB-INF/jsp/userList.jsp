<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/user/addUserPage">添加用户</a>
	<a href="${pageContext.request.contextPath }/dept/addDeptPage">添加部门</a>
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>部门</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach items="${list }" var="u">
			<tr>
				<th>${u.id }</th>
				<th>${u.name }</th>
				<th>${u.dept.dname }</th>
				<th><a href="${pageContext.request.contextPath }/user/deleteUser?id=${u.id }">删除</a></th>
				<th><a href="${pageContext.request.contextPath }/user/updatePage?id=${u.id }">修改</a></th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>