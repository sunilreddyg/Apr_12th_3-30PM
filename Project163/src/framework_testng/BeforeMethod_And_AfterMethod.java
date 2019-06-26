package framework_testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod 
{
	
	  @Test//Invoke method to run without object creation.
	  public void tc001() 
	  {
		  Reporter.log("tc001 executed as expected",true);
	  }
	  
	  @Test//Invoke method to run without object creation.
	  public void tc002() 
	  {
		  Reporter.log("tc002 executed as expected",true);
	  }
	  
	  
	  @Test//Invoke method to run without object creation.
	  public void tc003() 
	  {
		  Reporter.log("tc003 executed as expected",true);
	  }
	
 
	  @BeforeMethod //Invoke every @test annotated method before
	  public void beforeMethod()
	  {
		  System.out.println("Before method");
	  }
	
	  @AfterMethod //Invoke every @test annotated method after.
	  public void afterMethod()
	  {
		  System.out.println("after method "+"\n");
	  }

}
