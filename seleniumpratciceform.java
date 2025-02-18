package seleniumpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumpratciceform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		dr.manage().window().maximize();
		
		WebElement t=dr.findElement(By.id("name"));
		t.sendKeys("SAURABH");
		t.clear();
		Thread.sleep(2000);
		
		WebElement e=dr.findElement(By.id("email"));
		e.sendKeys("sp9967985805@gmail.com");
		e.clear();
		Thread.sleep(2000);
		
		WebElement check= dr.findElement(By.id("gender"));
		check.isEnabled();
		check.click();
		check.isSelected();
		Thread.sleep(2000);
		
		WebElement m=dr.findElement(By.id("mobile"));
		check.isEnabled();
		m.sendKeys("6165381781");
		Thread.sleep(2000);
		
		WebElement d=dr.findElement(By.id("dob"));
		d.sendKeys("12-12-2024");
		Thread.sleep(2000);
		
		WebElement s=dr.findElement(By.id("subjects"));
		s.sendKeys("SOFTWARE TESING");
		Thread.sleep(2000);
		
		WebElement h=dr.findElement(By.xpath("//input[@id='hobbies']"));
		h.click();
		
		dr.findElement(By.id("picture")).sendKeys("C:\\Users\\admin\\Desktop\\assignment.txt");
		
		WebElement drop=dr.findElement(By.xpath("//select[@name='state']"));
		Select state=new Select(drop);
		state.selectByIndex(2);
		
		WebElement drop2=dr.findElement(By.id("city"));
		Select city =new Select(drop2);
		city.selectByIndex(2);

		WebElement b=dr.findElement(By.className("btn btn-primary"));
		b.submit();
		Thread.sleep(5000);

		
		
		
	 
		System.out.println("COMPLETED");
		
		
		dr.close();
	}

}
