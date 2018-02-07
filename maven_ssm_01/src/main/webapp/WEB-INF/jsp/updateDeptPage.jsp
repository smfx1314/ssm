<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改部门页面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/dept/updateDept" method="post">
		编号：<input type="text" name="did"  value="${dept.did }">
		部门：<input type="text" name="dname" value="${dept.dname }">
		<input type="submit" value="确定修改">
	</form>
</body>
</html>