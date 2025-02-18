package seleniumpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		WebDriver dr  =new ChromeDriver();
		dr.get("https://www.saucedemo.com/v1/");
		dr.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		dr.findElement(By.cssSelector("input.form_input")).sendKeys("secret_sauce");
		dr.findElement(By.cssSelector("input[type=submit]")).click();
		System.out.println("LOGIN SUCCESSFULL CSS SELECTORS");
		dr.close();
		
	}

}
