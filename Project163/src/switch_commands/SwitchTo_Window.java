package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window {

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Current window Runtime window Dynamic ID
		String FB_Homepage_ID=driver.getWindowHandle();
		System.out.println("Facebook Homepage Browser ID => "+FB_Homepage_ID);
		
		
		//Identify External link and click to open at Diff window.
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		
		System.out.println("before switch window focused at => "+driver.getTitle());
		
		
		//Get All Dynamic WIndowID's the session open throw webdriver scripting.
		Set<String> AllWindowIDS=driver.getWindowHandles();
		
		//Iterate for number of windows
		for (String EachWindowID : AllWindowIDS) 
		{
			//Accept condition when dynamic id doesn't match with Facebook homepage id
			if(!EachWindowID.equals(FB_Homepage_ID)) //!--NOT
			{
				//Switch to Instagram window
				driver.switchTo().window(EachWindowID);
				break;  //It Stop itreration and send control  out of loop.
			}
		}
		
		
		
		//Get Current window title
		System.out.println("WIndow focus at => "+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
