<%--
  Created by IntelliJ IDEA.
  User: 落凤
  Date: 2021/1/11
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上下文的例子（统计登录人数）</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/applicationServlet" method="get">
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
