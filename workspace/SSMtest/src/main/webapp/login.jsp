<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
ddddddddddd
<h1>使用 POST 方法读取数据</h1>
<ul>
<li><p><b>用户名:</b>
<%
// 解决中文乱码的问题
String username = new String((request.getParameter("username")).getBytes("ISO-8859-1"),"UTF-8");
%>
   <%=username%>
</p></li>
<li><p><b>密码:</b>
   <%= request.getParameter("password")%>
</p></li>
</ul>
</body>
</html>