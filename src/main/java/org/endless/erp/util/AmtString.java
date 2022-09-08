package org.endless.erp.util;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class AmtString {
    public static String format(String arg){
        return String.format("%.2f",arg);
    }
}
