package com.javaweb.music.domain;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.io.Serializable;

/**
  *     管理员
  *@Author 刘海
  *@Data 21:08 2021/10/18
  *@Param
  *@return
  */
public class Admin implements Serializable {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private  String password;
}
