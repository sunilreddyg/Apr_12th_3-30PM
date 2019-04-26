package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login_With_keyBoard_Shortcuts 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Set runtime environment variable for chrome
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://gmail.com");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		
		
		//Identify email editbox
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		
		Thread.sleep(4000);  //Timeout to load password
		
		
		//Identify password editbox
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello123456",Keys.ENTER);
		

		/*
		 * Sendkeys command allow "keyboard shotcuts" and "character sequences"
		 * 
		 * 		=> Define character sequences in double quotes
		 * 		=> Use keyboard shortcut using [  keys.TAB  ]
		 */
		

	}

}
