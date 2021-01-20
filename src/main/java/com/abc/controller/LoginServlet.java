package com.abc.controller;

import com.abc.common.Res;
import com.abc.dao.entity.User;
import com.abc.service.Impl.UserServiceImpl;
import com.abc.service.iservice.IUserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* request.setCharacterEncoding("uft-8");
        //取值
        response.setCharacterEncoding("utf-8");*/
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //处理
        //反馈
        System.out.println("到此一游");
        IUserService empService = new UserServiceImpl();

        try {
            Res res = empService.login(username,password);
            System.out.println(res.getData().toString());
            request.setAttribute("res",res);
            if(res!=null){
                request.setAttribute("msg","用户账号或密码错误");

                User user = new User("阿雷西欧","123456");
                HttpSession session = request.getSession();
                request.setAttribute("user",user);
                session.setAttribute("user",user);
                ServletContext application = this.getServletContext();
                application.setAttribute("user",user);
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}