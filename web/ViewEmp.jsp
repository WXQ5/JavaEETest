<%--
  Created by IntelliJ IDEA.
  User: 落凤
  Date: 2021/1/18
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/FindAll" method="post">
    <input type="submit" value="提交">
</form>
<table>
    <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>职位</th>
        <th>入职日期</th>
        <th>员工工资</th>
    </tr>
    <c:if test="${!empty emps}">
        <c:forEach items="emps" var="emp">
            <tr>
                <td>${emp.empno}</td>
                <td>${emp.ename}</td>
                <td>${emp.job}</td>
                <td>${emp.hiredate}</td>
                <td>${emp.sal}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>
