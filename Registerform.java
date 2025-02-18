package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerform {

	public static void main(String[] args) {
		try {
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Register.html");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("SAURABH");
		dr.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Prajapati");
		dr.findElement(By.tagName("textarea")).sendKeys("NEW YORK");
		dr.findElement(By.xpath("//input[@type='email']")).sendKeys("sp9967985805@gmail.com");
		dr.findElement(By.xpath("//input[@type='tel']")).sendKeys("9967985805");
		dr.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		dr.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		WebElement d=dr.findElement(By.xpath("//select[@id='Skills']"));
		d.click();
		Select s=new Select(d);
		s.selectByValue("Software");
		
		
		
		WebElement d2=dr.findElement(By.xpath("//div[@id='msdd']"));
		d2.click();
		dr.findElement(By.xpath("//a[normalize-space()='Hindi']")).click();
		
		
	
		//dr.findElement(By.id("select2-country-container")).sendKeys("India");
		/*
		 * WebElement d3= d3.click(); Select s2=new Select(d3);
		 * s2.selectByValue("India");
		 */
		

		Select yearSelect = new Select(dr.findElement(By.xpath("//select[@id='yearbox']")));
        yearSelect.selectByValue("2003");

        Select monthSelect = new Select(dr.findElement(By.xpath("//select[@placeholder='Month']")));
        monthSelect.selectByValue("September");

        Select daySelect = new Select(dr.findElement(By.xpath("//select[@id='daybox']")));
        daySelect.selectByValue("7");

        // Set passwords
        dr.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("SAURABH");
        dr.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("SAURABH");

        // Upload a file (ensure file path is correct)
        dr.findElement(By.xpath("//input[@id='imagesrc']"))
          .sendKeys("C:/Users/admin/Downloads/Automation Testing.pdf");

        // Submit the form
        dr.findElement(By.xpath("//button[@id='submitbtn']")).click();

        System.out.println("Form submission completed successfully!");
		}
		catch(Exception e) {
		
		
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
