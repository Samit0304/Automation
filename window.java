package seleniumpack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");

        // Handle "Open New Tabbed Windows"
        driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click']")).click();
        handleWindows(driver);

        // Navigate back to main window
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");

        // Handle "Open Separate Windows"
        driver.findElement(By.xpath("//a[normalize-space()='Open Seperate Windows']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click']")).click();
        handleWindows(driver);

        // Navigate back to main window
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");

        // Handle "Open Multiple Windows"
        driver.findElement(By.xpath("//a[normalize-space()='Open Multiple Windows']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click']")).click();
        handleWindows(driver);

        // Close the driver
        driver.quit();
    }

    // Method to handle windows or tabs
    public static void handleWindows(WebDriver driver) {
        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();

        String parentWindow = iterator.next(); // Parent window handle
        System.out.println("Parent window title: " + driver.getTitle());

        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            driver.switchTo().window(childWindow);
            System.out.println("Child window title: " + driver.getTitle());
            driver.close(); // Close the child window
        }

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
    }
}
