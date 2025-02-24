package ABC7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Nationality_Static {
	
	static WebDriver driver;  // Declaration
	
	//Step1 - Declared Global Variables
	static String TestURL="https://opensource-demo.orangehrmlive.com/";
	static String USERNAME="Admin",PASSWORD="admin123";
	static String NationalityText="Indian116";
	
	
  @Test
  public void Login_Test() {
	  


		
	  TC01_Nationality_Static.OpenChromeBrowser();
	  TC01_Nationality_Static.Open_Orange_HRM(TestURL);
	  TC01_Nationality_Static.Login(USERNAME,PASSWORD);
	  TC01_Nationality_Static.AddNationality(NationalityText);
		
  }
  
  
  
  public static void OpenChromeBrowser() {
	  
		driver =new ChromeDriver(); //Chrome Browse window launched
		driver.manage().window().maximize() ;	
  }
  
  public static void Open_Orange_HRM(String TestURL1) {
	  

		driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  public  static void Login(String USERNAME1,String PASSWORD1) {
	  

		driver.findElement(By.name("username")).sendKeys(USERNAME1);
		driver.findElement(By.name("password")).sendKeys(PASSWORD1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
  }  
 
  public static void AddNationality(String NationalityText1) {
	  
	//Admin
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
			
			//Nationalities
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
			
			//Add
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			
			//Nationality Name Text Field
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(NationalityText1);
			
			//Save button
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
			
	  
  }  
 
  
  
  
}
