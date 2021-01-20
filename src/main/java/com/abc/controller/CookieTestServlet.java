package com.abc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieServlet")
public class CookieTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username  = req.getParameter("username");
        String password = req.getParameter("password");
        int days = Integer.parseInt(req.getParameter("days"));
        if("root".equals(username) && "123456".equals(password)){
            //第一次登录时设置Cookie
            if(req.getParameter("days")!=null){
                Cookie usernameCookie = new Cookie("username",username);
                usernameCookie.setMaxAge(days*24*60*60);
                Cookie passwordCookie = new Cookie("password",password);
                passwordCookie.setMaxAge(days*24*60*60);
                resp.addCookie(usernameCookie);
                resp.addCookie(passwordCookie);
                System.out.println("进入Cookieservlet里面");
            }
            //重定向   登录成功
            resp.sendRedirect("/success.jsp");
        }else{
            //登录失败  跳转到登录页面从新输入密码
            resp.sendRedirect("/CookieLogin.jsp");
        }
    }
}
