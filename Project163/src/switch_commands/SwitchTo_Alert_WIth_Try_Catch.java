package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert_WIth_Try_Catch 
{

	public static void main(String[] args) throws Exception
	{
	

		/*
		 * Scenario:-->  Verify Job Search with improper details..
		 * 
		 * 			Given url https://www.firstnaukri.com/
		 * 			when Click Search button without enter Course and keyword entry
		 * 			then system should respond with approriate error message.
		 */
		
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();    //Without Enter appropriate details..
		Thread.sleep(5000);
		
		
		//Apply try catch
		try {
			
			Alert alert=driver.switchTo().alert();
			
			//Get Text on alert popup
			String alert_text=alert.getText();
			System.out.println("popup contains text => "+alert_text);
			
			
			//Close browser window by click OK button
			alert.accept();
			
		} catch (NoAlertPresentException e) {
			System.out.println("Alert not presented");
			e.printStackTrace();
		}
		
		
		
		System.out.println("Continued Run");
		
		/*
		 * Note:--> try-catch capture runtime exceptions and allow user to continue script
		 * 			without interuption.
		 */
		
		
		
		
		
		

	}

}
