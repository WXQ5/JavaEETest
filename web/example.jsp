<%--
  Created by IntelliJ IDEA.
  User: 落凤
  Date: 2021/1/18
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("age",20);
    pageContext.setAttribute("name","tom");
%>
<h1>${age+2}</h1>
<h1>${age ge 20 && name == "tom"}</h1>
<%--empty是验证它后面的数据是否为空--%>
<h1>${empty  user.username}</h1>
<h1>${user.username}</h1>
<h1>${age>=18?"已成年":"未成年"}</h1>
</body>
</html>
