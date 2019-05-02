package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_DeSelect_Option_From_Multiple_Selection {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * User should modify selection by deselection option And verify
		 * Deselection from multiple selection
		 */
		
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
	    	State_Dropdown.deselectAll();
	    	State_Dropdown.selectByIndex(3);
	    	State_Dropdown.selectByIndex(6);
	    	State_Dropdown.selectByIndex(9);
	    	
	    	
	    	//Get Selection count
	    	int Dcount=State_Dropdown.getAllSelectedOptions().size();
	    	if(Dcount == 3)
	    	{
	    		//Deselect option from multiple selection
	    		State_Dropdown.deselectByIndex(6);
	    		
	    		
	    		//write a decision to verify method deselected option
	    		if(State_Dropdown.getAllSelectedOptions().size() == 2)
	    		{
	    			System.out.println("As expected user can modify search by deselection options");
	    		}
	    		
	    		else
	    		{
	    			System.out.println("user failed to deselect option");
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("The selection Doesn't meet it's expecation");
	    	}
	    	
	    	
	    }
	    else
	    {
	    	System.out.println("Dropdown is single option selection type");
	    }

	}

}
