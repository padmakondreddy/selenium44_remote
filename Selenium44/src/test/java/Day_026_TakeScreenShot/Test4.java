package Day_026_TakeScreenShot;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;



public class Test4 {
	
	static WebDriver driver;


	
	
	@Test
	public void AddNationalitiess() throws Exception
	{
		
	//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(scrFile, new File("C:\\ScreenShot1.jpg"));
	
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 TakesScreenshot scrShot1 =((TakesScreenshot)driver);
	 File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(SrcFile1, new File("C:\\TC021_Login\\TC1_ScreenShot1.jpg"));

	 
	 
	 findElement(By.name("username")).sendKeys("Admin");
	  TakesScreenshot scrShot2 =((TakesScreenshot)driver);
	  File SrcFile2=scrShot2.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile2, new File("C:\\TC021_Login\\TC1_ScreenShot2.jpg"));
	  
	  
	  findElement(By.name("password")).sendKeys("admin123");
	  TakesScreenshot scrShot3 =((TakesScreenshot)driver);
	  File SrcFile3=scrShot3.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile3, new File("C:\\TC021_Login\\TC1_ScreenShot3.png"));
	  
	  findElement(By.className("orangehrm-login-button")).click();
	  TakesScreenshot scrShot4 =((TakesScreenshot)driver);
	  File SrcFile4=scrShot4.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile4, new File("C:\\TC021_Login\\TC1_ScreenShot4.png"));
	  

	
	
	
	
	}
	
	
	
	
	
	
	
	
	 public  static WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}
	 
	
	
	
	
	
	
	
	
	
	
	

}
