package com.javaweb.music.controller;


import com.alibaba.fastjson.JSONObject;
import com.javaweb.music.service.AdminService;
import com.javaweb.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.security.x509.CertificatePolicyMap;

import javax.naming.event.ObjectChangeListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
      *     判断是否登入成功
      *@Author 刘海
      *@Data 21:47 2021/10/18
      *@Param
      *@return
      */
    @RequestMapping(value="/admin/login/status", method =RequestMethod.POST)
    public Object loginStatus(HttpServletRequest request , HttpSession session){
        JSONObject jsonObject =new JSONObject();
        String name =request.getParameter("name");
        String password =request.getParameter("password");
        boolean flag =adminService.verifyPassword(name ,password);
        if(flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"登录成功");
            session.setAttribute(Consts.NAME,name);
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"用户名或密码错误");
        return jsonObject;
    }
}
