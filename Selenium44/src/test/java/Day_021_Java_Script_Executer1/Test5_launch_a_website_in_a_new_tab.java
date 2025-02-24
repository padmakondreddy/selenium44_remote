package  Day_021_Java_Script_Executer1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5_launch_a_website_in_a_new_tab {

    WebDriver driver;
    
    @Test
    public void ByPixel() throws Exception {
    	
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Launch the application		

        driver.manage().window().maximize();

    	driver.get("https://opensource-demo.orangehrmlive.com/");

    	//((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com/')");
  
    	JavascriptExecutor js = (JavascriptExecutor) driver;
  
    	
    	// launch a website in new Tab
    	js.executeScript("window.open('https://www.google.com/')");
    }








    public  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
 
    
    
    
}