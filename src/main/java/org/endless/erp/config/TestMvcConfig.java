package org.endless.erp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
*@ClassName TestMvcConfig
*@Description 测试Spring MVC配置类扩展
*@Author EndlessError
*@Date 2022/11/17 17:05
*@Version
*/
@Configuration
public class TestMvcConfig implements WebMvcConfigurer {

//    /**
//    *@MethodName addViewControllers
//    *@Description 视图控制扩展
//    *@Param [registry]
//    *@Retrun void
//    *@Author EndlessError
//    *@Date 2022/11/17 17:06
//    *@Version
//    */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/viewtest").setViewName("test");
//    }

//    /**
//    *@MethodName testViewResoler
//    *@Description 视图解析器扩展,将自定义的视图解析器注入到Spring容器
//    *@Param []
//    *@Retrun org.springframework.web.servlet.ViewResolver
//    *@Author EndlessError
//    *@Date 2022/11/17 17:06
//    *@Version
//    */
//    @Bean
//    public ViewResolver testViewResoler() {
//        return new testViewResolver();
//    }
//
//    /**
//    *@ClassName TestMvcConfig
//    *@Description 自定义的视图解析器，实现自定义功能自动装配到Spinrg容器
//    *@Author EndlessError
//    *@Date 2022/11/17 18:53
//    *@Version
//    */
//    public static class testViewResolver implements ViewResolver {
//        @Override
//        public View resolveViewName(String viewName, Locale locale) throws Exception {
//            return null;
//        }
//    }

}
