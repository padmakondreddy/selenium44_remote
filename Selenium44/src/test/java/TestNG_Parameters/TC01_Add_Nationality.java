package TestNG_Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Add_Nationality {
	
	WebDriver driver;
	
  @Parameters({"Browser","UserName","Password","NationalityText"})	
  @Test
  public void Nationality(String Browser1,String UserName1,String PassWord1,String NationalityText1  ) throws Exception {
	  
			
	  		if(Browser1.equals("Chrome"))
			driver =new ChromeDriver();
	  		
	  		if(Browser1.equals("Edge"))
			driver =new EdgeDriver();
	  		
			driver.manage().window().maximize() ;	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			

		
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		//Login
		findElement(By.name("username")).sendKeys(UserName1);
		findElement(By.name("password")).sendKeys(PassWord1);
		findElement(By.xpath("//button[@type='submit']")).click();
		
		//AddNationality
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//a[text()='Nationalities']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(NationalityText1);
		findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
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
