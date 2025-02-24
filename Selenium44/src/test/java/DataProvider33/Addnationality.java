package DataProvider33;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Addnationality {
	
	WebDriver driver;
	
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "https://opensource-demo.orangehrmlive.com/", "Admin","admin123","Indian123" },
	      new Object[] {"https://opensource-demo.orangehrmlive.com/", "Admin","admin123","Indian124" },
	    };
	}
	    
	    
  @Test(dataProvider = "dp")
  public void AddNationality(String Testurl,String Username,String Password,String Nationalitytext) throws Exception {
	  
	 
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	  driver.get(Testurl);
	
	
	
	//Login
	findElement(By.name("username")).sendKeys(Username);
	findElement(By.name("password")).sendKeys(Password);
	findElement(By.xpath("//button[@type='submit']")).click();
	
	//AddNationality
	findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
	findElement(By.xpath("//a[text()='Nationalities']")).click();
	findElement(By.xpath("//button[text()=' Add ']")).click();
	
	findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Nationalitytext);
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
