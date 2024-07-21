package com.geekychetan.springboot_crud_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootCrudAppApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootCrudAppApplicationTests.class);

	String actual = "Geeky Chetan";

	@Test
	void contextLoads() {
		logger.info("Running hard coded first test...");
		assertEquals("Geeky Chetan", actual);
	}

}
