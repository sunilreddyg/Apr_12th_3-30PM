package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFrame_Using_Navigation_Commands 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Switch to frame using Frame URL
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");

		
		//Identify location under frame
		WebElement Email_Editbox=driver.findElement(By.id("email"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("qadarshan@gmail.com");
		
		
		//Identify location under frame
		WebElement TripID=driver.findElement(By.id("tripidSecond"));
		TripID.clear();
		TripID.sendKeys("8098080898");
		
		
		Thread.sleep(5000);
		driver.navigate().back();

		//CLick Flights link under webpage
		WebElement flights=driver.findElement(By.linkText("Flights"));
		flights.click();
				
				
		
	}

}
