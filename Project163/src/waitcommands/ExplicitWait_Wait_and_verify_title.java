package waitcommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_and_verify_title 
{

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		String Exp_title="Selenium - Web Browser Automation";
		
		
		//Create object for explicit
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.titleIs(Exp_title));
		System.out.println("SeleniumHQ title verified");
		
	
		//Click Downloads link
		WebElement Downloads=driver.findElement(By.linkText("Download"));
		Downloads.click();
		
		
		wait.until(ExpectedConditions.titleContains("Downloads"));
		System.out.println("Download page title verified");
		
		
		
		/*
		 * Note:--> Explicitwait throws "Timeout exception" In case
		 * 			expected behaviour not found.
		 */
	}

}
