package seleniumpack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitW {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		
		
		System.out.println("BUTTON CLICKED");
		d.close();

	}

}
