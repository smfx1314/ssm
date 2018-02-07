<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<%-- <jsp:forward page="${pageContext.request.contextPath }/user/list"></jsp:forward> --%>
	<a href="${pageContext.request.contextPath }/user/userList">查询用户</a>
	<a href="${pageContext.request.contextPath }/dept/deptList">查询部门</a>
</body>
</html>