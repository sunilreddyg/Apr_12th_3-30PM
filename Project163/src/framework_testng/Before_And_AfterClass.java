package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Before_And_AfterClass 
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
  
  
	  @BeforeClass //Method invoke before execution of first @Test annotated method with in class..
	  public void beforeClass() 
	  {
		  System.out.println("beforeclass");
	  }
	
	  @AfterClass //Method invoke after execution fo first @Test annotated methdo with in class.
	  public void afterClass() 
	  {
		  System.out.println("afterclass");
	  }

}
