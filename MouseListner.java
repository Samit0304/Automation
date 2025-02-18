package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseListner {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/menu");
		d.manage().window().maximize();
		WebElement mainMenu = d.findElement(By.xpath("//a[text()='Main Item 2']"));
        WebElement subMenu = d.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        WebElement subSubMenuItem = d.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));

        
        Actions actions = new Actions(d);

       
        actions.moveToElement(mainMenu).perform(); 
        Thread.sleep(2000);
        actions.moveToElement(subMenu).perform();  
        Thread.sleep(2000);
        actions.moveToElement(subSubMenuItem).click().perform();
        System.out.println("Sub Sub Item 1 clicked successfully!");
        d.close();

        
        

	}

}
