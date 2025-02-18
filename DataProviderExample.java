package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;
	

	@BeforeMethod
	public void setup() {
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider ="logindata")
	public void login(String u,String p) {

		driver.findElement(By.id("user-name")).sendKeys(u);
		driver.findElement(By.id("password")).sendKeys(p);
		driver.findElement(By.id("login-button")).click();

	}

	@DataProvider(name = "logindata")
	public Object[][] testdata() {
		return new Object[][] { 
			{ "standard_user", "secret_sauce" },{"locked_out_user","saurabh123"}

		};
	}
	@AfterMethod
	@Test
	public void teardown() {
		 driver.quit();
	}

}
