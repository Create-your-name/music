package com.javaweb.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MusicApplication {
/**
  *  熱更新 ：熱加載
 *  ctrl +shift +A --> 搜索 registry ,找到registry...  的 勾選
 *  compiler.outmaker.allow.where.app.running
 *
 *  ctrl +F9 快捷鍵 熱加載
 *  自動編譯
  *@Author 刘海
  *@Data 20:20 2021/10/10
  *@Param
  *@return
  */
    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
