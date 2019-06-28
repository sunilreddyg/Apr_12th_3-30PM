package framework_testng.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 
{
  @Test(groups= {"G1","G2","G3"})
  public void tc001() 
  {
	  Reporter.log("tc001 executed successfull");
  }
  
  @Test(groups="G2")
  public void tc002() 
  {
	  Reporter.log("tc002 executed successfull");
  }
  
  
  @Test(groups="G3")
  public void tc003() 
  {
	  Reporter.log("tc003 executed successfull");
  }
}
