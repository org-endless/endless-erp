package org.endless.erp.util;

import org.endless.erp.pojo.Price;
import org.springframework.stereotype.Component;

/**
*@ClassName PriceCalculation
*@Description 价格计算类
*@Author EndlessError
*@Date 2022/11/18 13:26
*@Version
*/
@Component
public class PriceCalculation {

    public static Price maxPriceCalculation(Price price,String real_price){
        price.getClass().getDeclaredFields();
        // price.setMin_price();
        return price;
    }
    public static Price minPriceCalculation(Price price){
        return price;
    }
    public static Price marketPriceCalculation(Price price){
        return price;
    }


}
