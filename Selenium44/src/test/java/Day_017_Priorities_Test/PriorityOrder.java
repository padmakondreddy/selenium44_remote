package Day_017_Priorities_Test;

import org.testng.annotations.Test;

public class PriorityOrder {
	
	
	
  @Test(priority=-1)
     public void Test99_AddJobs() {
	  
	  System.out.println("set of driver commands related to Add Jobs");
	  
  
  }
	
	@Test(priority=-1)
	  public void Test2_ModifyJobs() {
		  
		  System.out.println("set of driver commands related to Modify Jobs");
		  
		  
	  }
	  
	@Test(priority=1)
	  public void Test_DeleteJobs() {
		  
		  System.out.println("set of driver commands related to Delete Jobs");
		  
		  
	  }  
  
  
}
