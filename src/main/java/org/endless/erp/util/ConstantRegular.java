package org.endless.erp.util;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
*@ClassName ConstantRegular
*@Description 正则表达式常量类
*@Author EndlessError
*@Date 2022/11/18 16:50
*@Version
*/
@Component
@Data
public class ConstantRegular {
    // 正则表达式
    // 编号 Char(200)
    public static final String ID_REGULAR = "^{1,50}$";
    public static final String ID_REGULAR_MESSAGE = "Must be less than 50 characters!";
    // 姓名 Char(200)
    public static final String NAME_REGULAR = "^{1,200}$";
    public static final String NAME_REGULAR_MESSAGE = "Must be less than 200 characters!";
    // 价格 Decimal(22,2)
    public static final String Price_REGULAR = "^[0-9]{1,20}+(.[0-9]{2})?$";
    public static final String Price_REGULAR_MESSAGE = "Must be the right PRICE, less than 22 numbers, accurate to 0.01!";
    // 日期 yyyyMMdd
    public static final String DATE_REGULAR = "^((\\d{3}[1-9]|\\d{2}[1-9]\\d|\\d[1-9]\\d{2}|[1-9]\\d{3})(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)$";
    public static final String DATE_REGULAR_MESSAGE = "Must be the right DATE, yyyyMMdd!";
    // 时间 HHmmssSSS
    public static final String TIME_REGULAR = "^((\\d{3}[1-9]|\\d{2}[1-9]\\d|\\d[1-9]\\d{2}|[1-9]\\d{3})(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)$";
    public static final String TIME_REGULAR_MESSAGE = "Must be the right TIME, HHmmssSSS!";
}
