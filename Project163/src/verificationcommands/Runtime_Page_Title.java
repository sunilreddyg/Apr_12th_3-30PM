package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		
		//Verify equal comparision between two strings
		boolean flag=Runtime_title.equals(Exp_title);
		System.out.println("Selenium hq homepage title is => "+flag);
		
		
		//Write Decision statement to continue execution on expected title presented
		if(flag)
		{
			System.out.println("Expected title presented at current window");
			WebElement Search_Editbox=driver.findElement(By.id("q"));
			Search_Editbox.clear();
			Search_Editbox.sendKeys("Automated");
			
		}
		else
		{
			System.out.println("Expected title not verified at seleniumHQ homepage");
		}
		
		
		

	}

}
