package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_Option_At_Dropdown {

	public static void main(String[] args) throws Exception
	{
		
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	        
	    /*
	     * Convert Single option dropdown to multiple option dropdown using javascript..
	     */
	    ((JavascriptExecutor)driver).executeScript
	    ("document.getElementById('customState').setAttribute('multiple','multiple')");
	    Thread.sleep(5000);
	    
	    
	    boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
	    System.out.println("Multiple Selection state is => "+flag);
	    
	    
	    //decision statement
	    if(flag==true)
	    {
	    	System.out.println("Dropdown is multiple selection type");
	    	Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
	    	State_Dropdown.selectByIndex(3);
	    	State_Dropdown.selectByIndex(6);
	    	State_Dropdown.selectByIndex(9);
	    }
	    else
	    {
	    	System.out.println("Dropdown is single option selection type");
	    }
	    
	    
	    
	    

	}

}
