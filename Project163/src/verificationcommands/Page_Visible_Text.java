package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Visible_Text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Gettext:-->
		 * 			Method capture selected element and it's outterText
		 */
	
		/*
		 * Testcase:-->
		 * 			Verify welcome message display on valid email entry
		 * Steps:-->
		 * 			Enter site url http://gmail.com
		 * 			Enter valid email and click next button
		 * Expected:-->
		 * 			Navigate to next page and display Welcome message..
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//Identify email editbox and press enter key
		WebElement Email_editbox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email_editbox.clear();
		Email_editbox.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		Thread.sleep(5000);
		
		
		//Identify webpage
		WebElement Web_page=driver.findElement(By.tagName("body"));
		//Capture page visible text
		String Page_text=Web_page.getText();
	
		//Verify expected text contains webpage
		if(Page_text.contains("Welcome"))
		{
			System.out.println("Testpass:--> Expected text visible at webpage");
		}
		else
		{
			System.out.println("TestFail:--> text not visible at webpage..");
		}
		

	}

}
