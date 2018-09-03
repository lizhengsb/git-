<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>欢迎您,${emp.empName }</p>
	<p><a href="insert.jsp">新增</a></p>
	<table border="1px">
		<tr>
			<td>员工id</td>
			<td>员工姓名</td>
			<td>密码</td>
			<td>年龄</td>
			<td>性别</td>
			<td>学历</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${ph.list }" var="e">
			<tr>
				<td>${e.id }</td>
				<td>${e.empName }</td>
				<td>${e.empPwd }</td>
				<td>${e.empAge }</td>
				<td>${e.empSex }</td>
				<td>${e.empEdu}</td>
				<td>
					<a href="deleteById?id=${e.id }">删除</a>&nbsp;&nbsp;
					<a href="getById?id=${e.id }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	
	
	<%@ include file="PaperHelp.jsp"%>
</body>
</html>