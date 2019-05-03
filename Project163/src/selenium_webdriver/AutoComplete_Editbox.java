package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);  //Wait until notification window open.  
	    
	    
	    //identify roundtrip radio button and select Radio button.
	    driver.findElement(By.id("RoundTrip")).click();
	    
	    
	    //Identify boarding cities auto-complete editbox and type referral keyword
	    driver.findElement(By.id("FromTag")).clear();
	    driver.findElement(By.id("FromTag")).sendKeys("HYD");
	    Thread.sleep(4000);  //Timeout to load suggestions
	    driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();

	    
	    //IDentify destination cities editbox and type referral keyword.
	    driver.findElement(By.id("ToTag")).clear();
	    driver.findElement(By.id("ToTag")).sendKeys("MEL");
	    Thread.sleep(4000);  //Timeout to load suggestions
	    driver.findElement(By.linkText("Melbourne, AU - Tullamarine (MEL)")).click();
	    
	    Thread.sleep(4000);  //TO load Departue Data calendar
	    driver.findElement(By.linkText("12")).click();
	    
	    Thread.sleep(2000);  //TO load Arrival Data calendar
	    driver.findElement(By.linkText("23")).click();
	    
	    Thread.sleep(2000);  //wait for type data into return date calendar
	    driver.findElement(By.id("ReturnDate")).clear();
	    driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 23 Aug, 2019");
	    
	    //Select dropdown option
	    new Select(driver.findElement(By.id("Adults")))
	    .selectByVisibleText("4");
	    
	    //Using partial linktext identify link
	    driver.findElement(By.partialLinkText("Class of travel, Airline preference")).click();
	    Thread.sleep(4000);  //Timeout to load more fields..
	    
	    //Select dropdown option
	    new Select(driver.findElement(By.id("Class")))
	    .selectByVisibleText("Business");
	    
	    //Identify auto-complete editbox and type referral keywordname
	    driver.findElement(By.name("airline")).clear();
	    driver.findElement(By.name("airline")).sendKeys("Vistara");
	    Thread.sleep(4000);  //Timeout to load suggestions
	    driver.findElement(By.linkText("Vistara (UK)")).click();
	    
	    //click on search button
	    driver.findElement(By.id("SearchBtn")).click();
	    
	    
	    
	    
	}

}
