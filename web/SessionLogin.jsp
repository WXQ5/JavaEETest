<%--
  Created by IntelliJ IDEA.
  User: 落凤
  Date: 2021/1/8
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>应用Session</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/sessionServlet" method="get">
    <P>
        <label>用户名</label>
        <input type="text" name="username" id="username">
    </P>
    <p>
        <label>密码</label>
        <input type="text" name="password" id="password">
    </p>
    <button type="submit">登录</button>
</form>
</body>
</html>
