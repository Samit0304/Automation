package seleniumpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver dr  =new ChromeDriver();
		dr.get("https://www.saucedemo.com/v1/");
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		dr.findElement(By.xpath("//input[@class='form_input']")).sendKeys("secret_sauce");
		dr.findElement(By.xpath("//input[@class='btn_action']")).click();
		System.out.println("LOGIN SUCCESSFULL USING XPATH");
		dr.close();

	}

}
