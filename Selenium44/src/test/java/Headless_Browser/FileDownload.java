package Headless_Browser;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownload {
	
	WebDriver driver;
	
	@Test
	public void LoginTest() throws Exception
	{
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("browser.download.dir", "E:\\");*/
		
		
		//HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		String downloadFilepath = "C:\\Sudhakar\\";
				
				HashMap<String, Object> chromePrefs1 = new HashMap<String, Object>();		
				chromePrefs1.put("profile.default_content_settings.popups", 0);
				chromePrefs1.put("download.default_directory", downloadFilepath);
				
				ChromeOptions options1 = new ChromeOptions();
				options1.setExperimentalOption("prefs", chromePrefs1);
				
	
		driver=new ChromeDriver(options1);
		
	
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/div")).click();
		
		driver.findElement(By.xpath("//div[text()='ramayya1.txt']//following::i[3]")).click();
		
		 Robot robot = new Robot();
		 Thread.sleep(5000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		
	}
	
	
	/*
	ChromeOptions options = new ChromeOptions();

	Map<String, Object> prefs = new HashMap<String, Object>();

	prefs.put("download.default_directory", "/directory/path");

	options.setExperimentalOption("prefs", prefs);*/
	
	
	
	
	
	
	
	

}
