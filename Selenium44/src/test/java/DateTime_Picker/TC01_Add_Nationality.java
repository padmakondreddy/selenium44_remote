package DateTime_Picker;

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

public class TC01_Add_Nationality {
	
	WebDriver driver;
	
  @Test
  public void f( ) throws Exception {
	  
		 driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		//Login
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
		
		findElement(By.xpath("//span[text()='Leave']")).click();
		findElement(By.xpath("//a[text()='Leave List']")).click();
		
		findElement(By.xpath("(//div[@class='oxd-date-input'])[1]//child::i")).click();
		
		
		
				
	findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[2]")).click();
	
	String YearxpathfromExcel="2020"; //E1.getCellData("","","","");
	
	String Yearxpath="//li[@class='oxd-calendar-dropdown--option' and text()='"+YearxpathfromExcel+"']";
		
	//li[@class='oxd-calendar-dropdown--option' and text()='2021'
	
		//findElement(By.xpath("//li[@class='oxd-calendar-selector-year custom-cursor-on-hover']//child::i")).click();
		findElement(By.xpath(Yearxpath)).click();
		
		
		
		findElement(By.xpath("//ul[@class='oxd-calendar-selector']//child::li")).click();
		findElement(By.xpath("((((//ul[@class='oxd-calendar-selector']//child::li)//child::div)[1])//following-sibling::ul)//child::li[text()='April']")).click();
		
		
		String Datexpath1="21"; //E1.getCellData("","","","");
		String Datexpath="(//div[@class='oxd-calendar-dates-grid']//child::div)[text()='"+Datexpath1+"']";
		findElement(By.xpath(Datexpath)).click();
		
		
		
		findElement(By.xpath("//div[text()='Close']")).click();
		
		
		
		
		
		

		

				
		
		
		
		
		
	  }
  
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 Thread.sleep(500);
		}
		return elem;
	}
  
  
  
  
}
