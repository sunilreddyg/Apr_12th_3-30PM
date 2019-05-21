package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Attributes 
{

	public static void main(String[] args) throws Exception 
	{
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
		//Get Runtime attribute value using attribute name
		String Runtime_Value=Error_location.getAttribute("style");
		
		
		if(Runtime_Value.isEmpty())
		{
			System.out.println("Element visible at webpage");
		}
		else
		{
			System.out.println("Element not visible at webpage");
		}
	}

}
