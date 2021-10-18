package com.javaweb.music.service;

/**
  * 管理员service 接口
  *@Author 刘海
  *@Data 21:35 2021/10/18
  *@Param
  *@return
  */
public interface AdminService {
    /**
      *  验证密码成功
      *@Author 刘海
      *@Data 21:36 2021/10/18
      *@Param
      *@return
      */
    public boolean verifyPassword (String username, String password);
}
