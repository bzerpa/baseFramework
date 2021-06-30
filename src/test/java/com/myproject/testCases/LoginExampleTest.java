package com.myproject.testCases;

import org.testng.annotations.Test;

public class LoginExampleTest extends BaseTest {
	
	@Test
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://pedidosya.com");
		Thread.sleep(3000);
	}

}
