package com.javaweb.music.service.impl;

import com.javaweb.music.dao.AdminMapper;
import com.javaweb.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
  * 管理员service 实现类
  *@Author 刘海
  *@Data 21:38 2021/10/18
  *@Param
  *@return
  */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 验证密码成功
     *
     * @param username
     * @param password
     * @return
     * @Author 刘海
     * @Data 21:36 2021/10/18
     * @Param
     */

    @Override
    public boolean verifyPassword(String username, String password) {
       return adminMapper.verifyPassword(username,password)>0;

    }
}
