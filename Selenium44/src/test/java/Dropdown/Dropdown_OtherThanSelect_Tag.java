package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_OtherThanSelect_Tag {
	
	WebDriver driver;
	
	  @Test
	  public void dropdown() throws InterruptedException {
	  
		  	driver=new ChromeDriver();
			driver.manage().window().maximize() ;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			
	  
	  
	driver.findElement(By.xpath("//span[text()='Admin']")).click();//Admin
	driver.findElement(By.xpath("//span[text()='Organization ']")).click();//Organization
	driver.findElement(By.xpath("//a[text()='Locations']")).click();//Locations
	driver.findElement(By.xpath(" //*[text()=' Add ']")).click();//Add
	
	driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[1]")).
	sendKeys("Angola Org2"); // Name values enters as Hyd Org1
	
	// The below line clicks on the triangle button of  the dropdown
	driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
		
	Thread.sleep(2000); // execution is paused for 2 milli seconds
		
	// store all 239 country names in List Object as below
	//List<WebElement> elements=driver.findElements(By.xpath("//div[@role='option']/span"));
	
	List<WebElement> elements=driver.findElements(By.className("oxd-select-option"));
	
	
		
		// We will iterate list of all 239 WebElements by writing for each loop as
		for(WebElement element : elements)
		  {
			  	
				System.out.println(element.getText());
			
				String countryname=element.getText();
				
				if(countryname.equals("Angola"))
				{
					element.click();
					break;
				}
				
				
		  } /// exit line 69
		  
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

	  }

  
  
  
}
