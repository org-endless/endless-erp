package org.endless.erp.config;

import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
*@ClassName LocaleResolver
*@Description 国际化语言格式转化配置类
*@Author EndlessError
*@Date 2022/11/17 16:52
*@Version 
*/
public class LocaleResolver implements org.springframework.web.servlet.LocaleResolver {
    
    /**
    *@MethodName resolveLocale
    *@Description 国际化语言格式参数去除地区参数，例如去除“en”
    *@Param [request]
    *@Retrun java.util.Locale
    *@Author EndlessError
    *@Date 2022/11/17 16:52
    *@Version 
    */
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language = request.getParameter("lang");

        Locale locale = Locale.getDefault();

        if (!StringUtils.isEmpty(language)){
            String[] split = language.split("_");
            locale= new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
