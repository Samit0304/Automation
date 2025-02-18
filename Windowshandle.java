package seleniumpack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Windows.html");
		d.manage().window().maximize();
		
		/*d.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		Set<String> win=d.getWindowHandles();
		Iterator<String>i=win.iterator();
		
		String p=i.next();
		String c1=i.next();
		//String c2=i.next();
		
		d.switchTo().window(c1);
		System.out.println("Child window -"+d.getTitle());
		
		d.switchTo().window(p);
		System.out.println("Parent window -"+d.getTitle());
		
		
		System.out.println("------------------------");
		
		d.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		 
		Set<String> windowHandles = d.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        
        String parentWindow = iterator.next(); // Parent window handle
        System.out.println("Parent window title: " + d.getTitle());
        
        String childWindow = iterator.next();
        d.switchTo().window(childWindow);
        System.out.println("Child window title: " + d.getTitle());
        d.switchTo().window(parentWindow);
        
        System.out.println("------------------------");*/
		
	        
        d.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();
        d.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
        
        Set<String> windowHandles = d.getWindowHandles();
		 Iterator<String> iterator = windowHandles.iterator();
		 
        String parentWindow1 = iterator.next(); // Parent window handle
        String childWindow1 = iterator.next();
        String childWindow2=iterator.next();
        
      
   
        d.switchTo().window(childWindow1);
      
        System.out.println("Child window title: " + d.getTitle());
        
       
        d.switchTo().window(childWindow2);
        System.out.println("Child window title: " + d.getTitle());
        
        d.switchTo().window(parentWindow1);
        System.out.println("Parent window title: " + d.getTitle());  
        
        
        d.close(); // Close the child window
		
		
		
		
	
	
	
	
	}

}
