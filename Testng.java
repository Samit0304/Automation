package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng {
	WebDriver dr = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) dr;
	
	@Test
	public void login(){
		dr.get("https://www.saucedemo.com/v1/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		dr.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("LOGIN COMPLETED");	
	}
	
	@Test
	public void addtocart() {
		dr.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
		System.out.println("PRODUCT 1 ADDED");
	}
	
	@Test
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,500)");
	}
	@Test
	public void addtocart2() {
		dr.findElement(By.xpath("//div[6]//div[3]//button[1]")).click();
		System.out.println("PRODUCT 2 ADDED");
		js.executeScript("window.scrollBy(0,-500)");
	}
	@Test
	public void cart() {
		dr.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']")).click();
		js.executeScript("window.scrollBy(0,300)");
		dr.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
	}
	
	@Test
	public void filloudetails() {
		
		dr.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Saurabh");
		dr.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Prajapati");
		dr.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("400071");
		
		
	}
	@Test
	public void proceedbutton() {
		dr.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		js.executeScript("window.scrollBy(0,300)");
	}
	
	
	

	public static void main(String[] args) {
		
		
		
		

	}

}
