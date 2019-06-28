package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_InputData 
{
  @Test(dataProvider = "dp")
  public void tc001(String username,String mobilenum)
  {
	  
  }

  @DataProvider
  public static Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] {"arun" ,"8090890789" },
      new Object[] {"rakesh","9090899767" },
      new Object[] {"sajan","7987978787" },
      new Object[] {"akash","8978798798"  },
    };
  }
}
