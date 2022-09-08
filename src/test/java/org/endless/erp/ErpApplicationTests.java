package org.endless.erp;

import org.endless.erp.pojo.Price;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ErpApplicationTests {

	@Autowired
	private Price price;
	@Test
	void contextLoads() {
		System.out.println(price);
	}

}
