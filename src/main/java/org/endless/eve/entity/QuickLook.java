package org.endless.eve.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class QuickLook {
    private String item;
    private String item_name;
    private ArrayList<String> regions;
    private String hours;
    private String minqty;
    private ArrayList<Order> sell_orders;
    private ArrayList<Order> buy_orders;
}
