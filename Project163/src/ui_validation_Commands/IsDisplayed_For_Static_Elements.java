package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Testcase:--> Verify password editbox visible on valid email
		 * Expected:--> Should visible after return confirmation from DB..
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		
		//Writing decision statement to Continue actions on email, only when it was visible and enable at webpage
		if(Email_eb.isDisplayed() && Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com"+Keys.ENTER);  //Press Enter keyword after enter email.
		}
		else
		{
			System.out.println("Element not visible");
		}
		
		
		Thread.sleep(5000);  //Timeout to load password visible at webpage
		
		
		/*
		 * Note:--> Here password is a runtime element it only visible at front page on successfull
		 * 			email validaiton..
		 */
		
		//Identify Location of Password
		WebElement Password_Editbox=driver.findElement(By.name("password"));
		//Writing decision to accept on element visble and Enable Status
		if(Password_Editbox.isDisplayed() &&  Password_Editbox.isEnabled())
		{
			Password_Editbox.clear();
			Password_Editbox.sendKeys("Hello12345");
		}
		else
		{
			System.out.println("Password element not enable or displayed");
		}
		
		
	

		/*
		 * ElementNotvisibleException   ==> When user perform action on hidden element  
		 * InvalidElementstateException ==> When user perform action on disabled element
		 */
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
