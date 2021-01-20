package com.abc.controller;

import com.abc.dao.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        String name = reqest.getParameter("uname");
        String pas = reqest.getParameter("password");
        if("admin".equals(name) && "123456".equals(pas)){
            HttpSession session = reqest.getSession();
            Users users = new Users(name,pas);
            session.setAttribute("users",users);
            response.sendRedirect("/SessionSuccess.jsp");
        }else {
            //随便引用一个登录页面就好  只要能够
            response.sendRedirect("/login.jsp");
        }
    }
}
