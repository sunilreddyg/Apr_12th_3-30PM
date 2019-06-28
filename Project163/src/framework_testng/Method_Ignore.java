package framework_testng;

import org.testng.annotations.Test;

public class Method_Ignore 
{
  @Test
  public void tc001()
  {
	  
	  
  }
  
  @Test(enabled=false)  //Ignore method execution..
  public void tc002()
  {
	  
	  
  }
  
  
  @Test(enabled=false,priority=2,description="Login with valid data")
  public void tc003()
  {
	  
	  
  }
  
  
  
}
