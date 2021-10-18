package com.javaweb.music.dao;

import org.springframework.stereotype.Repository;

/**
  * 管理员
  *@Author 刘海
  *@Data 21:11 2021/10/18
  *@Param
  *@return
  */
@Repository
public interface AdminMapper {
    /**
      *     验证密码是否正确
      *@Author 刘海
      *@Data 21:11 2021/10/18
      *@Param
      *@return
      */
    public int verifyPassword(String username, String password);
}
