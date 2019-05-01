package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		/*
		 * Dropdown selection using visible text:-->
		 * 	
		 * 			new Select(WebElement).SelectByvisibletext("Optionname");
		 */
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Delhi");
		Thread.sleep(4000);  //timeout to load cities
		
		//select dropdown using option value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("new-delhi");
		
		
		//Identify editbox and type locality name
		driver.findElement(By.name("localityName")).clear();
		driver.findElement(By.name("localityName")).sendKeys("Gandhi nagar");

		
		//Select dropdown using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(4);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
