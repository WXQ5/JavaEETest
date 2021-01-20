package com.abc.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//统计登录人数
@WebServlet("/applicationServlet")
public class ApplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if("root".equals(username) && "123456".equals(password)){
            System.out.println("登陆成功");
            ServletContext application = this.getServletContext();
            int loginNum=0;
            if(application.getAttribute("loginNum")!=null){
                //获取历史登录人数
                loginNum = Integer.parseInt(application.getAttribute("loginNum").toString());
            }
            loginNum++;
            application.setAttribute("loginNum",loginNum);
            response.sendRedirect("ApplicationSuccess.jsp");
        }else {
            response.sendRedirect("ApplicationLogin.jsp");
        }
    }
}
