package org.endless.erp;

import org.endless.erp.util.ConstantResourceReader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ErpApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(ConstantResourceReader.ID_REGULAR);
	}

}
