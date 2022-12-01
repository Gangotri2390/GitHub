package Sal_Mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesNG {
	WebDriver driver;
//	@BeforeMethod
//	public void pre() {
//		System.out.println("Presanity");
//	}
		
	

	@Test
	public void a() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.com/");

		String ActualTital = driver.getTitle();
		System.out.println("Actual Tital = " + ActualTital);

		String ExpectedTital = "Amazon.com. Spend less. Smile more.";
		System.out.println("Expected Tite= " + ExpectedTital);
	}

	public boolean AssertEquals(String actualTital, String expectedTital) {

		return false;
	}

@Test()
	
	public void c() {
		driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		}
		
	
@Test()
public void b() {
	driver.findElement(By.id("twotabsearchtextbox")).isEnabled();
	driver.close();
}
}
	
	


