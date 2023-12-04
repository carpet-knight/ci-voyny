
package com.jetbrains.alarmmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class SecondTests {

	@Test
	void secondContextLoads() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(1,1);
	}

	@Test
	void secondContextLoads_1() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_2() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_3() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_4() throws InterruptedException {
		Thread.sleep(10000);
		assertEquals(2,2);
	}
}
