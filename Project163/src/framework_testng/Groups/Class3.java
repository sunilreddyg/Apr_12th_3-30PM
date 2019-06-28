package framework_testng.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 
{
	  @Test(groups="G1")
	  public void tc007() 
	  {
		  Reporter.log("tc007 executed successfull");
	  }
	  
	  @Test(groups="G2")
	  public void tc008() 
	  {
		  Reporter.log("tc008 executed successfull");
	  }
	  
	  @Test(groups="G1")
	  public void tc009() 
	  {
		  Reporter.log("tc009 executed successfull");
	  }
}
