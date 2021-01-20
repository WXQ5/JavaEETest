<%@ page import="com.abc.dao.entity.User" %>
<%@ page import="com.abc.dao.entity.Users" %><%--
  Created by IntelliJ IDEA.
  User: 落凤
  Date: 2021/1/8
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session引用</title>
</head>
<body>
<%
    if(session.getAttribute("users") != null){
        Users user = (Users) session.getAttribute("users");
 %>
    <h1>欢迎您<%=user.getUname()%></h1>
<%

    }else{
        response.sendRedirect("/CookieLogin.jsp");
    }
%>
<a href="<%=request.getContextPath()%>/offservlet">安全退出</a>
<a href="<%=response.encodeURL("test1.jsp")%>">test1</a>
</body>
</html>
