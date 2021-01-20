<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功页面</title>
</head>
<body>
   <!-- 根据请求属性里的，图片地址集合来显示已上传成功的图片 -->
   <h1>进入页面</h1>
<c:forEach items="${urls}" var="url">
   <div>
      <img src="/upload/${url}" alt="">
   </div>
   <h1>${url}</h1>
</c:forEach>
</body>
</html>