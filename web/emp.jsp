
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>JSP第一个测试文件</title>
    <link rel="stylesheet" href="emp.css">
</head>
<body>

<%--一个提交表单 提交到demo4--%>
<form action="/javaweb/demo4" method="post">
    <p>
        <%--文本框添加正则表达式--%>
        <input type="text" name="empno" id="empno" value="${param.empno}" placeholder="员工编号" pattern="^[1-9]\d{3,10}$"/>
        <input type="text" name="ename" id="ename" value="${param.ename}" placeholder="员工姓名" pattern="^[A-Za-z]{3,20}$"/>
       <%--生成一个员工职务的下拉列表--%>
        <select name="job" id="job">
            <option>--选择--</option>
                <c:forEach items="${jobList}" var="one">
                    <option value="${one}" ${param.job == one?'selected':''}>${one}</option>
                </c:forEach>
        </select>
        <input type="submit" value="搜索">
    </p>
</form>

<%--请求转发 JSP和Java之间数据的传递方式--%>
<table class="emp">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>职务</th>
        <th>就职日期</th>
        <th>底薪</th>
        <th>奖金</th>
        <th>部门</th>
    </tr>
    <%--从请求里面获取绑定的数据 放到变量one里面--%>
   <c:forEach items="${empList}" var="one">
            <tr>
                <td>${one.empno}</td>
                <td>${one.ename}</td>
                <td>${one.job}</td>
                <td>${one.hiredate}</td>
                <td>${one.sal}</td>
                <td>${one.comm}</td>
                <td>${one.dname}</td>
            </tr>
   </c:forEach>

</table>
</body>
</html>
