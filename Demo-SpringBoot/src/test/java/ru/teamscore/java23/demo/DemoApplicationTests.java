package ru.teamscore.java23.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Assert.isTrue(true, "Test fails");
	}

}
