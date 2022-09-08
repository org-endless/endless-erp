package org.endless.erp.pojo;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class QuickLook {
    private String item;
    private String item_name;
    private ArrayList<String> regions;
    private String hours;
    private String minqty;
    private ArrayList<Order> sell_orders;
    private ArrayList<Order> buy_orders;
}
