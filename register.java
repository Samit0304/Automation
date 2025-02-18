package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class register {

    public static void main(String[] args) {
        // Set WebDriver path if not in system PATH
        
        WebDriver dr = new ChromeDriver();

        try {
            // Open the URL and maximize the window
            dr.get("https://demo.automationtesting.in/Register.html");
            dr.manage().window().maximize();

            // Fill out the form
            dr.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("SAURABH");
            dr.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Prajapati");
            dr.findElement(By.tagName("textarea")).sendKeys("NEW YORK");
            dr.findElement(By.xpath("//input[@type='email']")).sendKeys("sp9967985805@gmail.com");
            dr.findElement(By.xpath("//input[@type='tel']")).sendKeys("9967985805");

            // Select gender
            dr.findElement(By.xpath("//label[normalize-space()='Male']")).click();

            // Select hobbies
            dr.findElement(By.xpath("//input[@id='checkbox1']")).click();

            // Select skills
            WebElement skillsDropdown = dr.findElement(By.xpath("//select[@id='Skills']"));
            Select skillsSelect = new Select(skillsDropdown);
            skillsSelect.selectByValue("Software");

            // Select language
            WebElement languagesDropdown = dr.findElement(By.xpath("//div[@id='msdd']"));
            languagesDropdown.click();
            dr.findElement(By.xpath("//a[normalize-space()='Hindi']")).click();

            // Select date of birth
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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            dr.quit();
        }
    }
}
