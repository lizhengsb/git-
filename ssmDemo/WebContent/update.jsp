<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
	<table>
		<tr>
			<td>
				<input type="hidden" name="id" value="${e.id }"/>
				姓名：
			</td>
			<td><input type="text" name="empName" value="${e.empName }"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" name="empPwd" value="${e.empPwd }"/></td>
		</tr>
		<tr>
			<td>年龄：</td>
			<td><input type="text" name="empAge" value="${e.empAge }"/></td>
		</tr>
		<tr>
			<td>性别：</td>
			<td><input type="text" name="empSex" value="${e.empSex }"/></td>
		</tr>
		<tr>
			<td>学历：</td>
			<td><input type="text" name="empEdu" value="${e.empEdu }"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="修改"/></td>
			<td><input type="button" value="取消" id="quxiao"/></td>
		</tr>
	</table>
</form>
<script>
	document.getElementById("quxiao").onclick=function(){
		location.href="queryAll";
	}
</script>
</body>
</html>