package com.TesNG;

import org.testng.annotations.Test;

public class Login {
	@Test(priority=-1)
	public void tc_1() {
//		Assert.assertEquals(true, true);
	System.out.println("First Test Case");
		
	}
	@Test(priority = 1)
	public void tc_2() {
		System.out.println("Second Test Case");
//		Assert.assertEquals(true, false);
		
	}

}
