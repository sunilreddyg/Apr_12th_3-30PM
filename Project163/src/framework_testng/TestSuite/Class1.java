package framework_testng.TestSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 
{
  @Test
  public void tc001() 
  {
	  Reporter.log("tc001 executed successfull");
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("tc002 executed successfull");
  }
  
  
  @Test
  public void tc003() 
  {
	  Reporter.log("tc003 executed successfull");
  }
}
