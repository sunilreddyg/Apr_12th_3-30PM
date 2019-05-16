package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Page_Title 
{

	public static void main(String[] args) 
	{
		/*
		 * Scenario:--> Verify Required webpage displayed at browser window
		 * 		Given  url http://seleniumhq.org
		 * 		When user click on go button
		 * 		Then load application to browser window with unique title.
		 */
		
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Capture current window runtime title
		String Runtime_title=driver.getTitle();
		System.out.println("page title is => "+Runtime_title);
		
		
		
		/*
		 * How to copy current page title manually 
		 * 
		 * 			=> Open webpage
		 * 			=> "Right click"  on page  And Select "View pageSource"
		 * 			=> Copy Title from pagesource 
		 */
		
		String Exp_title="Selenium - Web Browser Automation";
		
		
		
		
		
		
		
		

	}

}
