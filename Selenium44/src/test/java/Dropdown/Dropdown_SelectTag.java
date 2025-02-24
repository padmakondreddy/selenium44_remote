package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_SelectTag {
	
	WebDriver driver;
	

	  @Test
	  public void dropdown() {
	 
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  
	  Select dropdown =new Select(driver.findElement(By.name("country")));

	  dropdown.selectByVisibleText("INDIA");
	  //	dropdown1.selectByIndex(1);
	 // dropdown.selectByValue("INDIA");
	 
	 
	 
	 
	 
	    
	  }

}
