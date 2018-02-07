<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门列表</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/user/userList">用户列表</a>
	<a href="${pageContext.request.contextPath }/dept/addDeptPage">添加部门</a>
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>编号</th>
			<th>部门</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach items="${deptList }" var="dept">
			<tr>
				<th>${dept.did }</th>
				<th>${dept.dname }</th>
				<th><a href="${pageContext.request.contextPath }/dept/deleteDept?did=${dept.did }">删除</a></th>
				<th><a href="${pageContext.request.contextPath }/dept/updateDeptPage?did=${dept.did }">修改</a></th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>