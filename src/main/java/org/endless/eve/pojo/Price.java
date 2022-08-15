package org.endless.eve.pojo;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Price {
    private String max_price;
    private String min_price;
    private String volume;
}
