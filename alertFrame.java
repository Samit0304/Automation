package seleniumpack;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		Alert a = d.switchTo().alert();
		a.accept();

		// delayed button
		d.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();

		d.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
		Thread.sleep(2000);
		a.dismiss();
//		
		d.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
		Thread.sleep(2000);
		a.sendKeys("Automation Tester");
		a.accept();
//		
		d.close();
		System.out.println("COMPLETED");

	}

}
