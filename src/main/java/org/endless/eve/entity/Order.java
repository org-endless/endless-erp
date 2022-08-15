<<<<<<< HEAD
package main.java.org.endless.eve.entity;
=======
package org.endless.eve.entity;
>>>>>>> 2b4ba74 (commit!)

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String order_id;
    private String region;
    private String station;
    private String station_name;
    private String security;
    //range收单范围, 0:本空间站, 32767:本星系, 65536:本星域, 其他数字为收单跳数
    private String range;
    private String order_price;
    private String vol_remain;
    private String min_volume;
    private String expries_time;
    private String reported_time;
}
