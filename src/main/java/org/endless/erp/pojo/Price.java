package org.endless.erp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.endless.erp.util.ConstantRegular;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Price {
    // 现价
    @NotEmpty
    @Pattern(regexp = ConstantRegular.Price_REGULAR, message = ConstantRegular.Price_REGULAR_MESSAGE)
    private String cur_price;
    // 上日价格
    @Pattern(regexp = ConstantRegular.Price_REGULAR, message = ConstantRegular.Price_REGULAR_MESSAGE)
    private String pre_price;
    // 上次价格
    @Pattern(regexp = ConstantRegular.Price_REGULAR, message = ConstantRegular.Price_REGULAR_MESSAGE)
    private String last_price;
    // 平均价格
    @Pattern(regexp = ConstantRegular.Price_REGULAR, message = ConstantRegular.Price_REGULAR_MESSAGE)
    private String avg_price;
    // 最低价
    @Pattern(regexp = ConstantRegular.Price_REGULAR, message = ConstantRegular.Price_REGULAR_MESSAGE)
    private String min_price;
    // 最高价
    @Pattern(regexp = ConstantRegular.Price_REGULAR, message = ConstantRegular.Price_REGULAR_MESSAGE)
    private String max_price;
    // 市场价格
    @Pattern(regexp = ConstantRegular.Price_REGULAR, message = ConstantRegular.Price_REGULAR_MESSAGE)
    private String market_price;
}
