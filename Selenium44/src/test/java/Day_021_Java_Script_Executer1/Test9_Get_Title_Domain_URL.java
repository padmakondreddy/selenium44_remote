package  Day_021_Java_Script_Executer1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test9_Get_Title_Domain_URL {

    WebDriver driver;
    
    @Test
    public void ByPixel() throws Exception {
    	
    	
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.manage().window().maximize();
    	driver.get("https://amazon.in/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        String url=  js.executeScript("return document.URL;").toString();
        System.out.println(url);
   
        String domainName=  js.executeScript("return document.domain;").toString();
        System.out.println(domainName);
       
        String titleText =  js.executeScript("return document.title;").toString();
        System.out.println(titleText);
        
        String CurrentURL=driver.getCurrentUrl();
        System.out.println(CurrentURL);
        
        String WindowTitle=driver.getTitle();
        System.out.println(WindowTitle);
        //https://www.koyeb.com/blog/introduction-to-synchronous-and-asynchronous-processing
       
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