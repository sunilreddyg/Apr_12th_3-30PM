package framework_testng.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 
{
	  @Test(groups="G3")
	  public void tc004() 
	  {
		  Reporter.log("tc004 executed successfull");
	  }
	  
	  @Test(groups="G2")
	  public void tc005() 
	  {
		  Reporter.log("tc005 executed successfull");
	  }
	  
	  
	  @Test(groups="G1")
	  public void tc006() 
	  {
		  Reporter.log("tc006 executed successfull");
	  }
}
