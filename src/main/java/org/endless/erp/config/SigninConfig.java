package org.endless.erp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
*@ClassName SigninConfig
*@Description 登录页面配置类
*@Author EndlessError
*@Date 2022/11/17 16:56
*@Version 
*/
@Configuration
public class SigninConfig implements WebMvcConfigurer {

    /**
    *@MethodName addViewControllers
    *@Description 视图跳转控制器扩展
    *@Param [registry]
    *@Retrun void
    *@Author EndlessError
    *@Date 2022/11/17 16:57
    *@Version
    */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("signin");
        registry.addViewController("/signin").setViewName("signin");
    }

    /**
    *@MethodName localeResolver
    *@Description 国际化参数扩展注入spring容器
    *@Param []
    *@Retrun org.springframework.web.servlet.LocaleResolver
    *@Author EndlessError
    *@Date 2022/11/17 16:56
    *@Version
    */
    @Bean
    public org.springframework.web.servlet.LocaleResolver localeResolver(){
       return new LocaleResolver();
    }
}
