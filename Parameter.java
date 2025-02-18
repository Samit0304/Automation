package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver dr=new ChromeDriver();
	@BeforeClass
	public void launch() {
		dr.get("https://www.saucedemo.com/v1/");
        dr.manage().window().maximize();
	}
	
	@Parameters({"u","p"})
	@Test
	public void login(String username,String pass) {
		dr.findElement(By.id("user-name")).sendKeys(username);
        dr.findElement(By.id("password")).sendKeys(pass);
        dr.findElement(By.id("login-button")).click();
        System.out.println("LOGIN COMPLETED");
	}

}
