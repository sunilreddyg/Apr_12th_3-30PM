package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Page_Url 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:--> Verify Required Dowload page displayed at browser window
		 * 		Given  url http://seleniumhq.org
		 * 		When user click Download button
		 * 		Then Display download page with expected url
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Identify download link
		WebElement Download_Tab=driver.findElement(By.linkText("Download"));
		Download_Tab.click();
		
		
		//Get Runtime current window URL
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Currnet window url is => "+Runtime_url);
		
		
		//Write Decision statement to accept on expected url presented
		if(Runtime_url.contains("download/"))
		{
			System.out.println("Expected url presented for download page");
		}
		else
		{
			System.out.println("Url Mismatch for download page");
		}
		


	}

}
