package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");

		WebElement t = d.findElement(By.xpath("//textarea[@id='APjFqb']"));
		t.sendKeys("selenium");
		Actions act = new Actions(d);
		act.keyDown(Keys.SHIFT).perform();

		act.sendKeys("selenium");
		act.keyUp(Keys.SHIFT);
		act.sendKeys(Keys.ENTER).perform();

		WebElement r = d.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]"));
		act.contextClick(r).perform();

		d.close();
	}

}
