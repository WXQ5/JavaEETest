<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%--上传下载的页面--%>
<body>
<%--上传具体内容看UpServlet --%>
  <form action="${pageContext.request.contextPath }/RegistorServlet" method="post" enctype="multipart/form-data">
     <table>
        <tr>
            <td>姓名</td>
            <td>
               <input type="text" name="uname">
            </td>
        </tr> 
        <tr>
          <td>图片1</td>
          <td>
             <input type="file" name="file1">
          </td>
        </tr>
        <tr>
          <td>图片2</td>
          <td>
             <input type="file" name="file2">
          </td>
        </tr>
        <tr>
          <td>图片3</td>
          <td>
             <input type="file" name="file3">
          </td>
        </tr>
        <tr>
          <td colspan="2">
             <input type="submit" value="注册">
          </td>
        </tr>
     </table>
  </form>
  <%--点击该链接直接下载   具体看LoadServlet--%>
  <a href="${pageContext.request.contextPath }/LoadTxtServlet">下载链接</a>
</body>
</html>