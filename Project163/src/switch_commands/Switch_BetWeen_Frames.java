package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_BetWeen_Frames {

	public static void main(String[] args) 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		//Switch to frame using webelement referal
		WebElement AllPackages_Frame=driver.findElement(By.cssSelector("frame[title='All Packages']"));
		driver.switchTo().frame(AllPackages_Frame);
		
		//Click link under all packages frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		//Get Controls from frame to main page
		driver.switchTo().defaultContent();
		
		
		//Switch to frame using name property
		driver.switchTo().frame("packageFrame");
		
		//Click link under package frame
		driver.findElement(By.linkText("Alert")).click();
		
		
		//Get Controls from frame to main page
		driver.switchTo().defaultContent();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
