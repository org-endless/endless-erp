package org.endless.erp.pojo;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Market {
    private Price all_price;
    private Price buy_price;
    private Price sell_price;
}
