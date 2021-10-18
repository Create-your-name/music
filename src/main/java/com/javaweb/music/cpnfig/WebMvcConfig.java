package com.javaweb.music.cpnfig;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
  *         解决跨域问题
  *@Author 刘海
  *@Data 21:01 2021/10/18
  *@Param
  *@return
  */
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
      * 重写WebMvc方法 来解决跨域问题
      *@Author 刘海
      *@Data 21:04 2021/10/18
      *@Param
      *@return
      */
    @Override
    public  void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowCredentials(true);
    }
}
