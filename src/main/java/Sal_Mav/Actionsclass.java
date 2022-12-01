package Sal_Mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsclass {

public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe\\");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in");
	driver.manage().window().maximize();
		
	WebElement	asc=driver.findElement(By.xpath("//input[@type='text']"));
		Actions act= new Actions(driver);
		act.click(asc).perform();
		act.sendKeys("Shoes").perform();
		WebElement	asc1=driver.findElement(By.xpath("//input[@type='submit']"));
		act.click(asc1).perform();
		Thread.sleep(1000);
		
	
		WebElement asc2=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a"));
		Thread.sleep(5000);
		act.scrollToElement(asc2).perform();
		Thread.sleep(5000);
//		act.click(asc2).perform();
;		Thread.sleep(4000);

		driver.close();
	}

}
//input[@type='submit']