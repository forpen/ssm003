<%--
  Created by IntelliJ IDEA.
  User: teacher_c410
  Date: 2021/7/23
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/select" method="post">
    请输入用户名：<input type="text" name="uname"/><br/>
    <input type="submit" value="查询"/>
</form>
</body>
</html>

