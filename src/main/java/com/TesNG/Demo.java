package com.TesNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo {
	
@BeforeClass
	public void tc_0() {
		System.out.println("Before Method");
	}
	@Test
	public void tc_1() {
		System.out.println("Test Case1");
	}
	

	@Test
	public void tc_2() {
		System.out.println("Test Case2");
		
	}
	
	


}