package  Day_021_Java_Script_Executer1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4_Scroll_by_pixel {

    WebDriver driver;
    
    @Test
    public void ByPixel() throws Exception {
    	
    	
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Launch the application		
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

    
        
        // This  will scroll down the page by  1000 pixel vertical	
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,4500)");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-3500)");
        
        /*
         * scrollBy(x-pixels,y-pixels)"); 
         * x-pixels is the number at x-axis, 
         * it moves to the left if number is positive 
         * and it move to the right if number is negative . 
         * y-pixels is the number at y-axis,
         *  it moves to the down if number is positive and
         *   it move to the up if number is in negative .
         */
        
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