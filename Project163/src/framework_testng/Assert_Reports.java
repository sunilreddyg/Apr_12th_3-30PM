package framework_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Reports 
{
	
  @Test
  public void tc001() 
  {
	  
	  //Assert stop the @test annotated method execution on Invalid comparision
	  Assert.assertEquals("Signi", "Signin");
	  Reporter.log("Both strings are matching");
	  
  }
  
  @Test
  public void tc002() 
  {
	  
	  //Assert stop the @test annotated method execution on Invalid comparision
	  Assert.assertEquals("Sign", "Sign");
	  Reporter.log("Both strings are matching");
	  
  }
  
  
  
  
}
