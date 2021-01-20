package com.abc.controller;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

//上传下载的下载的servlet
@WebServlet("/LoadTxtServlet")
public class LoadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SmartUpload su = new SmartUpload();
        su.initialize(getServletConfig(),req,resp);
        su.setContentDisposition(null);
        try {
            //文件下载之后，文件名不变
            su.downloadFile("D:\\日志.log");
          /* //可以制定文件下载之后的新名字，第一个参数是下载的文件在服务器的路径，第二个参数是下载内容的类型，第三个参数是下载之后的新名字
            su.downloadFile("D:\\日志.log","","a.log");
            //支持中文的方式
            su.downloadFile("E:\\work.docx", "", URLEncoder.encode("工作.docx", "utf-8"));
        */
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
    }
}
