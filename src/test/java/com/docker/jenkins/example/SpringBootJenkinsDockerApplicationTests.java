package com.docker.jenkins.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootJenkinsDockerApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(true,true);
	}

}
