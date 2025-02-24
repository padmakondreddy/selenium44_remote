package Day_45_Assertions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class TC01_Add_Nationality {
	
	WebDriver driver;
	
  @Test
  public void Nationality( ) throws Exception {
	  
			
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		//Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		 
		//boolean flag=true;
		//Assert.assertEquals(flag, true);
		
		String str=driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).getText();
		
		SoftAssert s1=new SoftAssert();
		
		s1.assertEquals(str, "Admins");
		
		if(str.equals("Admins"))
		{
			
			Reporter.log("Soft assesertion success for Admins page validation");
		}
		else
		{
			Reporter.log("Soft assesertion failed for Admins page validation");
		}
		
		//AddNationality
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Indian39");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
  }
  
  
  
}
