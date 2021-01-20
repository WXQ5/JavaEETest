<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 落凤
  Date: 2021/1/18
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>el表达式和JSTL联合使用</title>
</head>
<body>
<%
    pageContext.setAttribute("sex",0);
%>
<c:set var="age" value="20"></c:set>
<%--<c:if test="${sex==0}">
    <c:set var="sex2" value="女"></c:set>
</c:if>
<c:if test="${sex==1}">
    <c:set var="sex2" value="男"></c:set>
</c:if>--%>
<%--多分枝--%>
<c:choose>
    <%--一个when相当于一个else if--%>
    <c:when test="${sex==0}">
        <c:set var="sex2" value="女"></c:set>
    </c:when>
    <c:when test="${sex==1}">
        <c:set var="sex2" value="男"></c:set>
    </c:when>
    <%--otherwise相当于else--%>
    <c:otherwise>
        <c:set var="sex2" value="不详"></c:set>
    </c:otherwise>
</c:choose>
<h1>${sex2}</h1>
<%
    List<String> names = new ArrayList<>();
    names.add("张三");
    names.add("李四");
    names.add("张三");
    pageContext.setAttribute("names",names);
%>
<%--items指的是循环的集合 用el来获取，每次循环取出集合里面的数据，存入本地属性，var里面是本地属性名--%>
<c:forEach items="${names}" var="name">
    <h1>${name}</h1>
</c:forEach>
</body>
</html>
