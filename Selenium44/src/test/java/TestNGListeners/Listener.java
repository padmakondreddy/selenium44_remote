package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listener  implements ITestListener   {
	
	
	
	@Override		
    public void onFinish(ITestContext Result) 					
    {		
		Reporter.log("The name of the testcase Finished is :"+Result.getName());
    }		

    @Override		
    public void onStart(ITestContext Result)					
    {		
    	Reporter.log("The name of the testcase started is :"+Result.getName());	
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }		

    // When Test case get failed, this method is called.		
    @Override		
    public void onTestFailure(ITestResult Result) 					
    {		
    	System.out.println("The name of the testcase failed is :"+Result.getName());
    
    	Reporter.log("The name of the testcase failed is :"+Result.getName());
    
    }		

    // When Test case get Skipped, this method is called.		
    @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
	    System.out.println("The name of the testcase Skipped is :"+Result.getName());	


    }		

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");		
    Reporter.log("The name of the testcase started is :"+Result.getName());
    }		

    // When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());
    
		Reporter.log("The name of the testcase Passed is :"+Result.getName());

		
	
    }		

  
}
