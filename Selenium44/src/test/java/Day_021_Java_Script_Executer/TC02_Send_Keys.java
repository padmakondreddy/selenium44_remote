package  Day_021_Java_Script_Executer;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;			
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TC02_Send_Keys 
{		
	
	WebDriver driver;
	
	
    @Test		
    public void Login() throws Exception 					
    {		
	    driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Amazon.in");
		
		WebElement searchInput=findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		js.executeScript("arguments[0].value='Mobiles';", searchInput);
		//js.executeScript("arguments[0].setAttribute('value','Mobiles')", searchInput);
		
		//findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		
		//findElement(By.id("nav-search-submit-button")).click();
		WebElement searchbutton=findElement(By.id("nav-search-submit-button"));
	    js.executeScript("arguments[0].click();", searchbutton);
		
		WebElement Canadalink=findElement(By.xpath("//a[text()='Canada']"));
		
		js.executeScript("arguments[0].scrollIntoView();", Canadalink);
		Thread.sleep(2000);
	    js.executeScript("arguments[0].click();", Canadalink);
	    
	  
		
		
		
        //WebElement username=findElement(By.id("username"));
    
        
       // JavascriptExecutor js = (JavascriptExecutor)driver;	
       
      // js.executeScript("arguments[0].innerHTML = 'Admin'", username);
      //  js.executeScript("arguments[0].innerHTML = 'admin123'", password);
        
       // js.executeScript("arguments[0].setAttribute('value','Admin')", username);
        //Thread.sleep(10000);
        //js.executeScript("arguments[0].setAttribute('value','admin123')", password);
     
        
        //js.executeScript("arguments[0].value='Admin';", username);
      //  js.executeScript("arguments[0].value='admin123';", password);
        //innerHTML
        
        //js.executeScript("arguments[0].setAttribute('value','Admin')", username);
        //js.executeScript("arguments[0].setAttribute('value','admin123')", password);
        
      //  Thread.sleep(8000);
        
   
       
  
       /* WebElement button =driver.findElement(By.xpath("//button[text()=' Login ']"));
        
        js.executeScript("arguments[0].style.border='3px solid purple'", button);
        Thread.sleep(8000);
        js.executeScript("arguments[0].focus();", button);*/
        
       // WebElement lbutton=findElement(By.xpath("//button[text()=' Login ']"));
     
       // jsTriggerEventOnElement(driver,lbutton,"click");
        
       // lbutton.click();
     
    }		
    
    //https://stackoverflow.com/questions/35127108/how-to-set-value-to-input-web-element-using-selenium
    public static void jsTriggerEventOnElement(WebDriver driver, WebElement element, String eventName) throws InterruptedException { 
        String jsFunction = " var clickEvent = document.createEvent ('Event');  clickEvent.initEvent ('" + eventName + "', true, true); arguments [0].dispatchEvent (clickEvent); ";
        
       // String jsFunction1 = " var clickEvent = document.createEvent ('Events');  clickEvent.initEvent ('" + eventName + "', true, false); arguments [0].dispatchEvent (clickEvent); ";
        
        
       // document.createEvent('Events'); evObj.initEvent(etype, true, false);el.dispatchEvent(evObj)
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid blue'", element);
        Thread.sleep(1000);
        
        System.out.println(jsFunction);
        js.executeScript(jsFunction, element);
        //js.executeScript("arguments[0].focus();", element);
     
        //Thread.sleep(2000);
        //js.executeScript("arguments[0].click();", element);
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