<%@ page language="java" pageEncoding="gb2312"%>
<%@ page contentType="text/html;charset=gb2312"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <title>��¼ҳ��</title>
    <meta http-equiv="Content-Type" content="text/html charset=gb2312">
</head>
<body>
    <%--ʹ��EL���ʽ--%>
    <h1>${requestScope.msg}</h1>
   <form action="<%= request.getContextPath() %>/loginServlet" method="post">
	   <p>������<input type="text" name="username" id="username" value="${param.username}" /></p>
	  <p>���룺<input type="password" name="password" value="${param.password}"/></p>
   	  <button type="submit">��¼</button>
   </form>
    <h1>��ȡ�������ԣ�${requestScope.user.username}</h1>
    <h1>��ȡ�Ự���ԣ�${sessionScope.user.username}</h1>
    <h1>��ȡ���������ԣ�${applicationScope.user.password}</h1>
</body>
</html>