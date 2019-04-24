package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_InterFace 
{

	public static void main(String[] args)
	{
		
		
		/*
		 * Note:-->  Webdriver is a interface class, It contains set of 
		 * 			 methods to manupulate and test browser interfaces...
		 * 
		 * 			=>WebDriver is a common interface class it design to 
		 * 				manipulate all browser instances supported by selenium.
		 * 
		 * 		Advantages:-->
		 * 				Support cross browser automation.
		 */
		
		
		//Set runtime environment variable for chrome
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://facebook.org");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		
		//Identify location at webpage
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("qadarshan@gmail.com");
		
		//Identify password location at webpage
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello123456");
		
		
		//Identify Firstname editbox
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Arjun");
		
		//Identify surname editbox
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Krishna");
		

	}

}
