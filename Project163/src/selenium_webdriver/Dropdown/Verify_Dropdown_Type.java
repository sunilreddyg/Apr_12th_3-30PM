package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Type {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> Verify dropdown is a single option or multiple option
		 * 				selection type..
		 */
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	    
	    boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
	    System.out.println("Multiple Selection state is => "+flag);
	    
	    
	    /*
	     * Convert Single option dropdown to multiple option dropdown using javascript..
	     */
	    ((JavascriptExecutor)driver).executeScript
	    ("document.getElementById('customState').setAttribute('multiple','multiple')");
	    Thread.sleep(5000);
	    
	    
	    boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
	    System.out.println("Multiple Selection state is => "+flag1);
	    
	    
}

}
