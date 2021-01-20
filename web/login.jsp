<%@ page language="java" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <title>登录页面</title>
    <meta http-equiv="Content-Type" content="text/html charset=gb2312">
</head>
<body>
    <%--使用EL表达式--%>
    <h1>${requestScope.msg}</h1>
   <form action="<%= request.getContextPath() %>/loginServlet" method="post">
	   <p>姓名：<input type="text" name="username" id="username" value="${param.username}" /></p>
	  <p>密码：<input type="password" name="password" value="${param.password}"/></p>
   	  <button type="submit">登录</button>
   </form>
    <h1>获取请求属性：${requestScope.user.username}</h1>
    <h1>获取会话属性：${sessionScope.user.username}</h1>
    <h1>获取上下文属性：${applicationScope.user.password}</h1>
</body>
</html>