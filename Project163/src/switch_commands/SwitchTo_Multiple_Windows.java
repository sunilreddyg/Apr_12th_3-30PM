package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchTo_Multiple_Windows
{

	public static void main(String[] args) throws InterruptedException
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		////Get Main window ID
		String ClearTrip_ID=driver.getWindowHandle();
		System.out.println("Cleartrip Homepage window Dynamic id => "+ClearTrip_ID);
		
		
		

		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		
		//Get All window Dynamic ID's open by WebDriver.
		Set<String> AllwindowIDs=driver.getWindowHandles();
		//Apply foreach to iterate all windows
		for (String Eachwindow : AllwindowIDs) 
		{
			//Switch To Every window using unorder dynamic ID
			driver.switchTo().window(Eachwindow);
			
			//Capture every window Runtime title
			String Runtime_title=driver.getTitle();
			
			//Verify runtime title matches with any expected title
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break;  //it keep window controls where runtime tile matches and break iteration for loop
			}
			
		}
		
		
		
		System.out.println("Current focus window title is => "+driver.getTitle());

	}

}
