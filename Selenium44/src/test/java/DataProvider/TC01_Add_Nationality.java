package DataProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Add_Nationality {
	
	WebDriver driver;
	
	//step1.Copy and paste dataprovider syntax
	
		@DataProvider(name="Dp")

		   public Object[] DataProvider() {

		     Object data[][]=  new Object[3][4];

			     // First set of Input data
			     data[0][0]= "https://opensource-demo.orangehrmlive.com/"; 
			     data[0][1]= "Admin";
			     data[0][2]= "admin123";
			     data[0][3]= "Indian35";   
			     
			     // Second set of Input data
			     data[1][0]= "https://opensource-demo.orangehrmlive.com/"; 
			     data[1][1]= "Admin";
			     data[1][2]= "admin123";
			     data[1][3]= "Indian36";
			     
			     // Third set of Input data
			     data[2][0]= "https://opensource-demo.orangehrmlive.com/"; 
			     data[2][1]= "Admin";
			     data[2][2]= "admin123";
			     data[2][3]= "Indian37";  
			       
			     return data;
		  }
	
		//step2.CONNECT WITH Dataprovider
	@Test(dataProvider="Dp")
  public void Nationality(String Testurl,String Username,String Password,String Nationalitytext ) throws Exception {
	  
		 driver=new ChromeDriver();
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
