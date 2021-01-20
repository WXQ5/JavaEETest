package com.abc.controller;

import com.jspsmart.upload.SmartUpload;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//上传下载的上转的servlet
@WebServlet("/RegistorServlet")
public class UpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        //(1)创建SmartUpload对象，以及初始化initialize(getServletConfig(),reqest,response);
        SmartUpload su = new SmartUpload();
        su.initialize(getServletConfig(),reqest,response);
        //2）设置上传文件大小上限（文件一B为单位），类型
        su.setMaxFileSize(1024*1024);
        su.setAllowedFilesList("jpg,png,gif");
        //3)设置上传位置
        File dir = new File("D:\\wxq_2\\upload");
        if(!dir.exists()){
            dir.mkdirs();
        }
        //创建一个集合，保存上传文件的路径
        List<String> urls = new ArrayList<>();
       //4）调用SmartUpLoad对象的upload
        try {
            //上传文件的开关
            su.upload();
            //4)读取上传文件个数,开始单个文件上传
            int count = su.getFiles().getCount();
            for (int i = 0; i < count; i++) {
                //获取上传的一个文件
                com.jspsmart.upload.File file = su.getFiles().getFile(i);
                if (file.getSize() == 0) {
                    continue;
                }
                //获取文件原来的名字
                String fileName = file.getFileName();
                file.saveAs(dir + "/" + fileName);
                //上传成功后，将文件在服务器上的名字存入集合里面
                urls.add(fileName);
            }
            //将urls存入到请求属性，然后转发到成功页面
            reqest.setAttribute("urls",urls);
            urls.stream().forEach(x-> System.out.println(x));
            System.out.println("进入跳转");
            reqest.getRequestDispatcher("UpLoadSuccess.jsp").forward(reqest,response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
