package org.endless.erp.pojo;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//从yaml获取参数默认值
//@ConfigurationProperties(prefix = "price")
//从配置文件获取参数默认值
//@PropertySource(value = "classpath:test.conf")
//data check
@Validated
public class Price {

    //@Value("${max_price}")
    @NotEmpty
    @Pattern(regexp = "^[0-9]+(.[0-9]{2})?$", message = "must be accurate to 0.01!")
    private String max_price;
    //@Value("${min_price}")
    @NotEmpty
    @Pattern(regexp = "^[0-9]+(.[0-9]{2})?$", message = "must be accurate to 0.01!")
    private String min_price;
    //@Value("${volume}")
    @NotEmpty
    private String volume;
}
