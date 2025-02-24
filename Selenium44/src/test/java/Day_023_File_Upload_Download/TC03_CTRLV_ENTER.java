 package  Day_023_File_Upload_Download;
import org.testng.annotations.*;

import java.awt.Robot;
import java.awt.event.KeyEvent;


public class TC03_CTRLV_ENTER
{
	
	    @Test
		public void File_upload()throws Exception
		  {
	    	 // Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(500);
			      
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(500);
			        

		       //  Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 
			 System.out.println("paste and enter done");
			
		  }	 	 
			 	 

	}