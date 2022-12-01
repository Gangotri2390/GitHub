package Sal_Mav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeCode {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement we=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		we.sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		
		WebElement wr=driver.findElement(By.linkText("Back to top"));
	act.scrollToElement(wr).perform();
	Thread.sleep(1000);
	wr.click();
	
	Thread.sleep(2000);
	WebElement we1=driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(2000);
	
	we1.click();
	we1.clear();
	
	Thread.sleep(1000);
	
	we1.sendKeys("Watches");
	act.sendKeys(Keys.ENTER).perform();
//	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
		

	}

}
