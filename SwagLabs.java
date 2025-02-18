package seleniumpack;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import com.google.common.io.Files;
@Listeners(ListenersClass.class)
public class SwagLabs {

	public static void main(String[] args) {
		// Initialize WebDriver
		WebDriver dr = new ChromeDriver();
		try {
			// Navigate to the URL
			dr.get("https://www.saucedemo.com/v1/");
			dr.manage().window().maximize();

			// Perform login actions
			dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			dr.findElement(By.xpath("//input[@id='login-button']")).click();
			System.out.println("LOGIN COMPLETED");

			
			File scrFile = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile, new File("C:\\Users\\admin\\Desktop\\swaglab.jpg"));
			System.out.println("SCREEN SHOT TAKEN ");

			
			dr.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
			System.out.println("PRODUCT 1 ADDED");

			JavascriptExecutor js = (JavascriptExecutor) dr;
			js.executeScript("window.scrollBy(0,500)");

			dr.findElement(By.xpath("//div[6]//div[3]//button[1]")).click();
			System.out.println("PRODUCT 2 ADDED");

			js.executeScript("window.scrollBy(0,-500)");
			
			dr.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']")).click();
			js.executeScript("window.scrollBy(0,300)");
			
			dr.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
			
			dr.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Saurabh");
			dr.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Prajapati");
			dr.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("400071");
			
			dr.findElement(By.xpath("//input[@value='CONTINUE']")).click();
			js.executeScript("window.scrollBy(0,300)");
			
			dr.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
			
			WebElement m=dr.findElement(By.xpath("//button[normalize-space()='Open Menu']"));
			m.click();
			
			WebElement l=dr.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
			l.click();
			System.out.println("logout");
//			Select s=new Select(m);
//			s.selectByContainsVisibleText("Logout");
			
			System.out.println("AUTOMATION COMPLETED");
			
			dr.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
