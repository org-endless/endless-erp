package org.endless.eve.pojo;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Market {
    private Price all_price;
    private Price buy_price;
    private Price sell_price;
}
