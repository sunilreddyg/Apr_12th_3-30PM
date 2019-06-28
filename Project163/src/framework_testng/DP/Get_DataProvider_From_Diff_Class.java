package framework_testng.DP;

import org.testng.annotations.Test;

public class Get_DataProvider_From_Diff_Class 
{
	
	
	
  @Test(dataProvider="dp",dataProviderClass=DP_InputData.class)
  public void tc002(String UID,String Mobile) 
  {
	  System.out.println(UID+"   "+Mobile);
  }
}
