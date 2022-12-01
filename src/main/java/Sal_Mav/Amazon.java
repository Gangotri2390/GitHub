package Sal_Mav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		WebElement asc = driver.findElement(By.xpath("//input[@type='text']"));

		asc.sendKeys("Watches");
		Thread.sleep(4000);
		int a=8;
		for (int i = 0; i < a; i++) {
			asc.sendKeys(Keys.ARROW_DOWN);
		}
		asc.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.close();

	}

}
