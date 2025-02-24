package DataProvider;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class AddNationality {
	
	WebDriver driver;
	
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian3"  },
	      new Object[] { "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian4"  },
	    };
	  }
	
	
	
  @Test(dataProvider = "dp")
  public void Nationality(String Testurl,String Username,String Password,String NationalityText) {
	  

		 driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		  driver.get(Testurl);
		
		
		
		//Login
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//AddNationality
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(NationalityText);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
	  
	  
	  
	  
  }

  
}
