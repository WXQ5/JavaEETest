package com.abc.controller;

import com.abc.dao.entity.Emp;
import com.abc.service.Impl.EmpServiceImpl;
import com.abc.service.iservice.IEmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindAll")
public class FindAllServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        //取值
        //处理
        EmpServiceImpl empServiceImpl =  new EmpServiceImpl();
        List<Emp> emps = empServiceImpl.findAll();
       // emps.stream().forEach(x-> System.out.println(x));
        System.out.println("进入");
        reqest.setAttribute("emps",emps);
        reqest.getRequestDispatcher("/ViewEmp.jsp").forward(reqest,response);
        //反馈
    }
}
