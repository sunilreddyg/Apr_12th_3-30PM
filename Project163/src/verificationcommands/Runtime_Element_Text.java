package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Element_Text 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> Capture text visible at location..
		 */
		
		/*
		 * Testcase:-->
		 * 			Verify error message displayed on Invalid Flight Search
		 * Steps:-->
		 * 			Enter site url http://cleartrip.com
		 * 			Without enter proper details click on search button
		 * Expected:-->
		 * 			System should display appropriate error message ""
		 * 
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Identify Signin button and perform click action
		WebElement Search_btn=driver.findElement(By.id("SearchBtn"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Identify Error location
		WebElement Error_location=driver.findElement(By.id("homeErrorMessage"));
		//Capture text available at error location
		String Act_error_msg=Error_location.getText();
		
		//store expected error message into referral variable.
		String Exp_error_msg="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		//Verify Expected and actual value using decision statement
		if(Act_error_msg.equals(Exp_error_msg))
		{
			System.out.println("Testpass:--> Expected error message displayed");
		}
		else
		{
			System.out.println("TestFail:--> Wrong error message displayed");
		}
		

	}

}
