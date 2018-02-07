<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户界面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user/addUser" method="post">
		用户名：<input type="text" name="name"> 
		部门名：<!-- <input type="text" name="dept.dname"> --> 
		<select name="dept.did">
			<c:if test="${not empty deptList }">
				<c:forEach items="${deptList }" var="d">
					<option value="${d.did }">${d.dname }</option>
				</c:forEach>
			</c:if>
		</select>
		<input type="submit" value="提交">
	</form>
</body>
</html>