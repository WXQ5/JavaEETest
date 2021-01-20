package com.abc.controller;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SmartUpload su = new SmartUpload();
        su.initialize(getServletConfig(),req,resp);
        su.setMaxFileSize(1024*1024);
        su.setAllowedFilesList("jpg,png,gif");
        File dir = new File("D:\\wxq_2\\upload");
        if(!dir.exists()){
            dir.mkdirs();
        }
        List<String> urls = new ArrayList<>();
        try {
            su.upload();
            int count = su.getFiles().getCount();
            for (int i = 0; i < count; i++) {
                com.jspsmart.upload.File file = su.getFiles().getFile(i);
                if(file.getSize() == 0){
                    continue;
                }
                String fileName = file.getFileName();
                file.saveAs(dir+"/"+fileName);
                urls.add(fileName);
            }
            req.setAttribute("urls",urls);
            req.getRequestDispatcher("UpLoadSuccess.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
