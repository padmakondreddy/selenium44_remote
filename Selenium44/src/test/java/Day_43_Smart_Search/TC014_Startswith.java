package Day_43_Smart_Search;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC014_Startswith {
	
	WebDriver driver;
	

	//String Nationality_xpath1 ="//*[starts-with(text(),'Nationalities')]";
	
	//String Nationality_xpath ="//*[starts-with(@id,'menu_admin_nationality')]";
	
	

		String Google_Input_text="//textarea[@class='gLFyf']";
	
		String KeyWordText ="//*[starts-with(text(),'selenium')]";
		
		String KeywordsText1="//span[contains(text(),'selenium')]";

	@Test
	public void Test1()throws Exception
	{
		
		
	
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	String suggkeywordsxpath="//span[starts-with(text(),'selenium')]/b";
		
		findElement(By.xpath(Google_Input_text)).sendKeys("selenium") ; 
		
	  List<WebElement> elements = driver.findElements(By.xpath(KeywordsText1));
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;		
	    
	    for(WebElement element:elements)
	    {
	    	
	    	js.executeScript("arguments[0].style.border='3px solid red'", element);
	    	
	    	System.out.println(element.getText());
	    	
	    	String str=element.getText();
	    	
	    	if(str.equals("selenium testing"))
	    	{
	    		element.click();
	    		break;
	    	}
	    	
	    	/*js.executeScript("arguments[0].style.border='3px solid red'", element);
	    	String str=element.getText();
	    	
	    	if(str.equals("dev"))
	    	{
	    		element.click();
	    		break;
	    	}*/

	    }


	    /*
	    
	    for ( int i=1 ; i<=elements.size() ;i++)  // i=1;  i<=10 ; i=i+1
	    {
	   
	      		  
	      		  String str1="//*[starts-with(text(),'selenium')]//following::span["  + i +  "]";
	      	
	    		    WebElement element=findElement(By.xpath(str1));
	    		    Thread.sleep(500);
	    		   
	    	       String WebElementText = element.getText();
	    	       
	    	       System.out.println("Get Text Value is from the WebElement: " + WebElementText);
	    	       
	    	       js.executeScript("arguments[0].style.border='3px solid red'", element);
	   	    	String str=element.getText();
	   	    	
	   	    	if(str.equals("selenium testing"))
	   	    	{
	   	    		element.click();
	   	    		break;
	   	    	}
	    	
	    }     */
	    	       

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
