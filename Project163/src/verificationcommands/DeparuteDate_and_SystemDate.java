package verificationcommands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeparuteDate_and_SystemDate
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Testcase:-->
		 * 		Verify deparute date match with system date / Today date
		 * Expected:-->
		 * 		Everday departure match with system date.
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		
		//Identify departure date editbox
		WebElement Departure_Date=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		//Capture input value from editbox
		String Ddate=Departure_Date.getAttribute("value");
		System.out.println("Current Departe date exist at software is =>"+Ddate);

		
		//Capture default system date
		Date d=new Date();
		//Create simple date formatter
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//using simple dateformatter convert system date
		String Sdate=sdf.format(d);
		
		
		//Writing decison to accept on system date match with departure date
		if(Ddate.equals(Sdate))
		{
			System.out.println("Testpass :--> System date is matching with departue date");
		}
		else
		{
			System.out.println("TestFail:--> System date mismatch with departure date");
		}

	}

}
