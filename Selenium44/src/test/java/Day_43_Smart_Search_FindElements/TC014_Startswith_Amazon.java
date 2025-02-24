package Day_43_Smart_Search_FindElements;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TC014_Startswith_Amazon {
	
	WebDriver driver;
	

		

	@Test
	public void Test1()throws Exception
	{
		
		
		
		
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://amazon.in");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		
		
		List<WebElement> Elements=driver.findElements(By.xpath("(//div[@class='navFooterLinkCol navAccessibility']//child::li)//child::a"));
	
	    
	    for(WebElement element:Elements)
	    {
	    	
	    	System.out.println(element.getText());
	    	
	    	
	    	 int count=Elements.size();
	    	 
	    	 System.out.println("elements size: "+ Elements.size());

	    	JavascriptExecutor js = (JavascriptExecutor)driver;	
	    	js.executeScript("arguments[0].style.border='3px solid red'", element);
	    	
	    	//Thread.sleep(2000);
	    	
	    	String str=element.getText();
	    	
	    	if(str.contains("Sell on Amazon"))
	    	{
	    		element.click();
	    		
	    		
	    		//js.executeScript("arguments[0].click();", element);
	    		
			 	//Actions actions = new Actions(driver);
			  	//actions.moveToElement(element).click().perform();
	    		//break;
	    	}

	    }


	    
	    
	  /*  for ( int i=0 ; i<Elements.size() ;i++)  // i=1;  i<=10 ; i=i+1
	    {
	   
	      		  
	      		  String str1="//*[starts-with(text(),'selenium')]//following-sibling::b["  + i +  "]";
	      	
	    		    WebElement element=findElement(By.xpath(str1));
	    		    Thread.sleep(500);
	    		   
	    	       String WebElementText = element.getText();
	    	       
	    	       System.out.println("Get Text Value is from the WebElement: " + WebElementText);
	    	       
	    	       js.executeScript("arguments[0].style.border='3px solid red'", element);
	   	    	/*String str=element.getText();
	   	    	
	   	    	if(str.equals("seleniumhq"))
	   	    	{
	   	    		element.click();
	   	    		break;
	   	    	}*/
	    	
	   // }     */
	    	       

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
