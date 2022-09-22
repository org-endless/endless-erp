package org.endless.erp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ErpSigninConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("signin");
        registry.addViewController("/signin").setViewName("signin");
    }

    @Bean
    //国际化配置注入spring容器
    public LocaleResolver localeResolver(){
       return new ErpLocaleResolver();
    }
}
