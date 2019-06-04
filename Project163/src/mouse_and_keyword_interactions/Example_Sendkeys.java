package mouse_and_keyword_interactions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Example_Sendkeys 
{

	public static void main(String[] args) throws Exception 
	{
	
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		//Enable mouse and keyboard actions on automation browser
		Actions action=new Actions(driver);
				
				
		
		//Identify Min salary Element
		WebElement Min_salary=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		Min_salary.click();
		Thread.sleep(5000);
		
		//Perfrom keyboard shortcut
		action.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
		
		

	}

}
