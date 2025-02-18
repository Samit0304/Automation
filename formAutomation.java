package seleniumpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		System.out.println("AUTOMATING THE FORM ");
		dr.get("https://www.techlistic.com/p/selenium-practice-form.html");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		dr.findElement(By.cssSelector("input[name=firstname]")).sendKeys("SAURABH ");
		Thread.sleep(3000);
		dr.findElement(By.cssSelector("input[name=lastname]")).sendKeys("PRAJAPATI ");
		Thread.sleep(3000);
		
		dr.findElement(By.cssSelector("input#sex-0")).click();
		Thread.sleep(3000);
		dr.findElement(By.cssSelector("input#exp-1")).click();
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/12/2024");
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//input[@id='profession-1']")).click();
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//input[@id='tool-2']")).click();
		Thread.sleep(3000);
		
		WebElement w= dr.findElement(By.xpath("//select[@id='continents']"));
		Select s=new Select(w);
		
		//s.selectByIndex(2);
		
		s.selectByVisibleText("Europe");
		Thread.sleep(3000);
		
		
		
		
		
		
		dr.close();
		

	}

}
