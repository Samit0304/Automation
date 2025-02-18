package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)
public class Swag {
    WebDriver driver= new ChromeDriver();// Declaring the WebDriver
    JavascriptExecutor js; // Declaring JavascriptExecutor

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Setting up the test suite...");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Test execution started...");
    }

    @BeforeClass
    public void beforeClass() {
        
        
       
        js = (JavascriptExecutor) driver;
        System.out.println("ChromeDriver initialized...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting a new test case...");
    }

    @Test
    public void login() {
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("LOGIN COMPLETED");
    }

    @Test(dependsOnMethods = "login")
    public void addToCart() {
        driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
        System.out.println("PRODUCT 1 ADDED");
        js.executeScript("window.scrollBy(0,500)");
    }

    @Test(dependsOnMethods = {"login", "addToCart"})
    public void addToCart2() {
        driver.findElement(By.xpath("//div[6]//div[3]//button[1]")).click();
        System.out.println("PRODUCT 2 ADDED");
        js.executeScript("window.scrollBy(0,-500)");
    }
    
    @Test
    public void title() {
    	String str="Swag Labs";
    	Assert.assertTrue(driver.getTitle().equals(str));
    	System.out.println("Title verified");
    }
    
    @Test
    public void verifyurl() {
    	Assert.assertFalse(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/"));
    	System.out.println("Url verified");
    }
    
    @Test
    public void testNotEqual() {
        String actual = "TestNG";
        String expected = "JUnit";
        Assert.assertNotEquals(actual, expected, "The values are unexpectedly equal!");
    }
    
    @Test
    public void testNull() {
        Object obj = null;
        Assert.assertNull(obj, "Object is not null!");
    }
    
    @Test
    public void testNotNull() {
        Object obj = new Object();
        Assert.assertNotNull(obj, "Object is null!");
    }




    @AfterMethod
    public void afterMethod() {
        System.out.println("Test case execution completed...");
    }

    @AfterClass
    public void afterClass() {
        // Closing the driver after all test cases are executed
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Browser closed and resources cleaned up...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("All test cases executed...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Test suite execution completed...");
    }
}
