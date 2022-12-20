package org.endless.erp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.endless.erp.util.ConstantRegular;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;



/**
*@ClassName Formula
*@Description 配方类
*@Author EndlessError
*@Date 2022/11/18 13:01
*@Version
*/
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Formula {
    // 配方编号
    @NotEmpty
    @Pattern(regexp = ConstantRegular.ID_REGULAR, message = ConstantRegular.ID_REGULAR_MESSAGE)
    private String formula_id;
    // 配方名称
    private Name formula_name;
    // 配方价格
    private Price formula_price;
}