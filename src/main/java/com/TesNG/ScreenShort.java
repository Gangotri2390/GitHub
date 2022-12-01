package com.TesNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShort {
	public WebDriver driver;

	@Test
	public void tc_0() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File ScreenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenshotFile, new File("C:\\Users\\Lenovo\\eclipse-workspace\\project\\Gangotri.jpg"));
		System.out.println("File Runnig");
	}

}
