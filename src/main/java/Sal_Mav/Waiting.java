package Sal_Mav;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waiting {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
	WebDriver driver =new FirefoxDriver();
		driver.get(("https://www.facebook.com"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement ele=driver.findElement(By.id("u_3_b_/R"));
		ele.click();
		ele.sendKeys("Gangotri");

		
		

	}

}
