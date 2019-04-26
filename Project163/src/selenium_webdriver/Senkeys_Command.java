package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senkeys_Command 
{

	public static void main(String[] args) 
	{
		//Set runtime environment variable for firefox
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://facebook.com");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		
		//Identify location at webpage
		driver.findElement(By.name("firstname"))
		.sendKeys("Newuser",Keys.TAB
		 ,"WebDriver",Keys.TAB
		 ,"NewuserWebdriver@gmail.com",Keys.TAB
		 ,"NewuserWebdriver@gmail.com",Keys.TAB
		 ,"Hello12345");
		
		
		
		//Select dropdown option using keyboard shortcut
		driver.findElement(By.id("day")).sendKeys("28");
		
		//Select dropdown option using keyboard shortcuts
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		//Select dropdown option using keyboard shortcuts
		driver.findElement(By.id("year")).sendKeys("2000");
		
		
		//click female radio button using xpath
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//click Signup button
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
		
		
		

	}

}
