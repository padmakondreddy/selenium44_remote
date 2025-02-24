package  Day_023_File_Upload_Download;
import org.openqa.selenium.By;	

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class TC04_FileDownLoad
{
	static WebDriver driver;
	 
		public String DestinationFile;
		
		//public  int iRow;
		
		
		// Draws a red border around the found element. Does not set it back anyhow.
		public WebElement findElement(By by)throws Exception {
		    WebElement elem = driver.findElement(by);
		 
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		    } 
		    Thread.sleep(10);
		    
		    return elem;
		    
		    
		    
		    
		    
		}
	 	
	    
	   

	    @Test
		public void File_Download()throws Exception
		  {
			
			//SendKeys
	    	   
				 driver =new ChromeDriver();
				 driver.manage().window().maximize() ;	
				 driver.get("https://opensource-demo.orangehrmlive.com/");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    	
					findElement(By.name("username")).sendKeys("Admin");
					findElement(By.name("password")).sendKeys("admin123");
					findElement(By.xpath("//button[@type='submit']")).click();
					
				 	 findElement(By.linkText("PIM")).click();
				 	 findElement(By.linkText("Employee List")).click();
				 	 
				 	 Thread.sleep(5000);
			 	     //findElement(By.linkText("0279")).click();
			 	 	 findElement(By.xpath("//div[text()='0295']")).click();
			 	
			 	 
			 	 String str1="(//div[@class='oxd-table-cell-actions']//child::button)[3]";
			 	
			 	 WebElement FileDownload= findElement(By.xpath(str1));
			 	 
			 	JavascriptExecutor js = (JavascriptExecutor)driver;
			 	js.executeScript("arguments[0].click();", FileDownload);
			 	 
			 	//Actions actions = new Actions(driver);
			  	//actions.moveToElement(FileDownload).click().perform();
			 	 
	    		 //String fname = findElement(By.xpath(str1)).getText(); // bsnl.txt
	    		// findElement(By.linkText(fname)).click(); // clicks on the file
	    		 
			
	 		  	
			 	 String SrcFile="C:\\Users\\trith\\Downloads\\"+"bsnl.txt";
			 	 String DestinationFile="C:\\HTML Report\\"+"bsnl.txt";
		
			 	Thread.sleep(8000);
			 	moveFile(SrcFile, DestinationFile);

		        
			 	 
		  }	 	 
			 	 
	
	    public static void moveFile(String src, String dest ) throws InterruptedException {
	        Path result = null;
	        try {
	           result =  Files.move(Paths.get(src), Paths.get(dest));
	           
	           
	           Thread.sleep(5000);
	        } catch (IOException e) {
	           System.out.println("Exception while moving file: " + e.getMessage());
	        }
	        if(result != null) {
	           System.out.println("File moved successfully.");
	        }else{
	           System.out.println("File movement failed.");
	        }  
	     }
	    
	
		
	
	}