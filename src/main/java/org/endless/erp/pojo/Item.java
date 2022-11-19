package org.endless.erp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.endless.erp.util.ConstantRegular;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
*@ClassName Item
*@Description 商品或者物品类
*@Author EndlessError
*@Date 2022/11/17 21:12
*@Version
*/
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Item {
    // 商品编号
    @NotEmpty
    @Pattern(regexp = ConstantRegular.ID_REGULAR, message = ConstantRegular.ID_REGULAR_MESSAGE)
    private String item_id;
    // 商品名称
    private Name item_name;
    // 商品价格
    private Price item_price;
    // 更新日期
    @Pattern(regexp = ConstantRegular.DATE_REGULAR, message = ConstantRegular.DATE_REGULAR_MESSAGE)
    private String upd_date;
    // 更新时间
    @Pattern(regexp = ConstantRegular.TIME_REGULAR, message = ConstantRegular.TIME_REGULAR_MESSAGE)
    private String upd_time;

}
