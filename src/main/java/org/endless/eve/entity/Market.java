package org.endless.eve.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Market {
    private Price all_price;
    private Price buy_price;
    private Price sell_price;
}
