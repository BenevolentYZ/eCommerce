package com.example.demo;

import com.example.demo.tests.OrderControllerTest;
import com.example.demo.tests.UserControllerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Suite.class)
@Suite.SuiteClasses({ UserControllerTest.class, OrderControllerTest.class })
@SpringBootTest
public class SareetaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
