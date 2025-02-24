package Day_022_Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC01_MouseOver2 {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	    driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Amazon.in");
		
		//findElement(By.name("//span[text()='Hello, sign in']")).click();
		//findElement(By.name("//span[text()='Your Account']")).click();
		
		// coming to mouse over  on menu and sub menu operations
		
	   // first , We have to create  web element object references for Main Menu and Sub Menu web elements ,as
		WebElement MainMenu=driver.findElement(By.xpath(""));
		
		WebElement SubMenu=driver.findElement(By.xpath(""));
		
		// And we have to create an object for actions class , as
		Actions actions=new Actions(driver);//
	
		// And we have to write 
		actions.moveToElement(MainMenu).
		moveToElement(SubMenu).
		click().build().perform();
		
	//like this we can perform menu and sub menu click operations by using actions class
		
		
	
		
		
		
		
		
		
		
		
		
	
		
  }
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by); 
		Thread.sleep(500);
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
}
