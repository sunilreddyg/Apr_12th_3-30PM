package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test 
{
	  @Test//Invoke method to run without object creation.
	  public void tc001() 
	  {
		  Reporter.log("tc001 executed as expected");
	  }
	  
	  @Test//Invoke method to run without object creation.
	  public void tc002() 
	  {
		  Reporter.log("tc002 executed as expected");
	  }
	  
	  
	  @Test//Invoke method to run without object creation.
	  public void tc003() 
	  {
		  Reporter.log("tc003 executed as expected");
	  }
}
