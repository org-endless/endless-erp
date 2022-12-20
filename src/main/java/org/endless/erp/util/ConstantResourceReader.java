package org.endless.erp.util;

import lombok.*;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
*@ClassName ConstantResourceReader
*@Description 常量资源读取类
*@Author EndlessError
*@Date 2022/11/18 15:02
*@Version
*/
@Component
@Getter
@ToString
@PropertySource(value = {"file:config/constant.conf"})
public class ConstantResourceReader {
    public static String ID_REGULAR;
    public static String DATE_REGULAR;
    //
    // @Value("${ID_REGULAR}")
    // public void setIdRegular(String idRegular) {
    //     ID_REGULAR = idRegular;
    // }
    // @Value("${DATE_REGULAR}")
    // public void setDateRegular(String dateRegular) {
    //     DATE_REGULAR = dateRegular;
    // }
}