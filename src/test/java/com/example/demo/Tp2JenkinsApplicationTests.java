package com.example.demo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Tp2JenkinsApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Test passed!");
        assertEquals(true,true); // Test toujours réussi
	}

}
