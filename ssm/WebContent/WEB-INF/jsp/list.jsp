<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示用户列表</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function del() {
	    var msg = "您真的确定要删除吗？";
	    if (confirm(msg) == true) {
	        return true;
	    } else {
	        return false;
	    }
	}
</script>
<style type="text/css">
	.table th{
		text-align: center;
	}
</style>
</head>
<body>
	<div class="container" style="width:100%">
        <%--标题--%>
        <div class="row">
            <div class="col-md-12">
                <h1 style="text-align: center;">欢迎</h1>

            </div>
        </div>
            <%--查询行--%>
         <div class="row" style="text-align: center">
             <div class="col-md-12">
                 <form class="form-inline" action="userList.do" method="post">
                     <label>姓名:</label>&nbsp;&nbsp;<input class="form-control" type="text" name="name">&nbsp;&nbsp;     
                     <input class="btn btn-default" type="submit" value="查询" style="cursor:hand">
                     <a class="btn btn-primary btn-sm" href="addPage.do">
                         <%--<span class="glyphicon glyphicon-zoom-in" ></span>--%> 添加用户
                     </a>
                     <a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath }/dept/deptList">
                         <%--<span class="glyphicon glyphicon-zoom-in" ></span>--%> 查询部门
                     </a>
                 </form>
             </div>
         </div>
		<%--表格--%>
		<div class="row">
	      <div class="col-md-12">
	          <table class="table table-bordered table-hover">
	              <tr>
	              	  <th>序号</th>
	                  <th>用户名</th>
	                  <th>部门</th>
	                  <th>操作</th>
	              </tr>
	                 <c:forEach items="${list}" var="user" >
	                  <tr>
	                  	  <th>${user.id }</th>
	                      <th>${user.name }</th>
	                      <th>${user.dept.dname }</th>
	                      <th>
	                      	  <a class="btn btn-primary btn-sm" href="addPage.do">
	                              <span class="glyphicon glyphicon-zoom-in" ></span>  添加
	                          </a>
	                          <a class="btn btn-primary btn-sm" href="updatePage.do?id=${user.id }">
	                              <span class="glyphicon glyphicon-zoom-in" ></span>  修改
	                          </a>
	                          <a class="btn btn-danger btn-sm" href="deleteUser.do?id=${user.id}" onclick="del()">
	                              <span class="glyphicon glyphicon-trash" ></span>  删除
	                          </a> 
	                          
	                      </th>
	                  </tr>
	              </c:forEach>
	          </table> 
	       </div>
		</div>
	</div>
</body>
</html>