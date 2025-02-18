package seleniumpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		System.out.println("OPENING SWAG LABS WEBSITES :");
		dr.get("https://www.saucedemo.com/v1/");
		dr.findElement(By.name("user-name")).sendKeys("standard_user");
		dr.findElement(By.name("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		System.out.println("LOGIN COMPLETED SUCCESSFULLY");
		System.out.println("NAVIGATING GOOGLE WEBSITES ");
		dr.navigate().to("https://www.google.co.in/");
		dr.findElement(By.linkText("Gmail")).click();
	    dr.navigate().back();
	    dr.findElement(By.partialLinkText("Ima")).click();	
	    dr.close();		
		System.out.println("TEST COMPLETED");
		
		
		

	}

}
