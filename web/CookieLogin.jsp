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
    <title>登陆页面使用Cookie</title>
</head>
<body>
<%
    //获取客户端传过来的Cookie，寻找用户名和密码的cookie是否存在，如果存在，跳转到servlet验证密码
    Cookie[] cookies = request.getCookies();
    String username = null;
    String password = null;
    if(cookies!=null){
        for (Cookie cookie:cookies) {
           if(cookie.getName().equals("username")){
               username=cookie.getValue();
           } else if(cookie.getName().equals("password")){
               password = cookie.getValue();
           }
           if (username!=null && password !=null){
               response.sendRedirect("/CookieServlet?username="+username+"&password="+password);
           }
        }
    }
%>
<form action="<%=request.getContextPath()%>/CookieServlet" method="get">
    <P>
        <label>用户名</label>
        <input type="text" name="username" id="username">
    </P>
    <p>
        <label>密码</label>
        <input type="text" name="password" id="password">
    </p>
    <p>
        <label>天数</label>
        <select name="days" >
            <option value="0">请选择</option>
            <option value="1">一天</option>
            <option value="3">三天</option>
            <option value="7">七天</option>
        </select>
    </p>
    <button type="submit">登录</button>
</form>
</body>
</html>
