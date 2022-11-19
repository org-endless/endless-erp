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
*@ClassName Name
*@Description 姓名或者名称类
*@Author EndlessError
*@Date 2022/11/17 22:48
*@Version
*/
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Name {
    // 全称
    @NotEmpty
    @Pattern(regexp = ConstantRegular.NAME_REGULAR, message = ConstantRegular.NAME_REGULAR_MESSAGE)
    private String full_name;
    // 名
    @Pattern(regexp = ConstantRegular.NAME_REGULAR, message = ConstantRegular.NAME_REGULAR_MESSAGE)
    private String first_name;
    // 姓
    @Pattern(regexp = ConstantRegular.NAME_REGULAR, message = ConstantRegular.NAME_REGULAR_MESSAGE)
    private String last_name;
    // 别名
    @Pattern(regexp = ConstantRegular.NAME_REGULAR, message = ConstantRegular.NAME_REGULAR_MESSAGE)
    private String alias_name;
    // 简称
    @Pattern(regexp = ConstantRegular.NAME_REGULAR, message = ConstantRegular.NAME_REGULAR_MESSAGE)
    private String brev_name;
}
