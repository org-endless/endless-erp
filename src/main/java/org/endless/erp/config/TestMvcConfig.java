package org.endless.erp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//测试扩展SpringMVC
@Configuration
public class TestMvcConfig implements WebMvcConfigurer {

    //视图跳转,不常用
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("/viewtest").setViewName("test");
    }

    //扩展视图解析器,不常用
    @Bean
    public ViewResolver testViewResoler() {
        return new testViewResolver();
    }

    public static class testViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }

}
