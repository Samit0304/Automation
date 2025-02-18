package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	WebDriver dr;  
	JavascriptExecutor js;

	@BeforeTest
	@Parameters("browser")
	public void setup(@Optional("chrome") String b) {  
		if (b.equalsIgnoreCase("Firefox")) {
			dr = new FirefoxDriver(); 
		} else if (b.equalsIgnoreCase("chrome")) {
			dr = new ChromeDriver();  
		} else {
			System.out.println("NO BROWSER LAUNCHED ");
			return;
		}

		dr.get("https://www.saucedemo.com/v1/");
		dr.manage().window().maximize();
		js = (JavascriptExecutor) dr;  
	}

	@Test
	public void login() {
		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		dr.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("LOGIN COMPLETED");
	}

	@Test(dependsOnMethods = "login")
	public void addToCart() {
		dr.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
		System.out.println("PRODUCT 1 ADDED");
		js.executeScript("window.scrollBy(0,500)");
	}

	@AfterClass
	public void afterClass() {
		if (dr != null) {
			dr.quit();
		}
		System.out.println("Browser closed and resources cleaned up...");
	}
}
