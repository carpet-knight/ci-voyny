package com.jetbrains.alarmmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class AlarmManagementApplicationTests {

	@Test
	void contextLoads() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(1,1);
	}

	@Test
	void contextLoads_1() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}

	@Test
	void contextLoads_2() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}

	@Test
	void contextLoads_3() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}

	@Test
	void contextLoads_4() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}


	@Test
	void contextLoads_5() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}
}
