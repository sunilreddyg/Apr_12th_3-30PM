package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Group_Links {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> Identify group links at webpage. And
		 * 		operate each link using iterations.
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify Footer navigation link
		WebElement Footer_Navigation_area;
		Footer_Navigation_area=driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
		
		//Find list of links under footer navigation..
		List<WebElement> All_links;
		All_links=Footer_Navigation_area.findElements(By.tagName("a"));
		
		//Iterate for number of links
		for (int i = 0; i < All_links.size(); i++) 
		{
			//get every link using dynamic number..
			WebElement Each_link=All_links.get(i);
			
			//Get Linkname and linkhref
			String linkname=Each_link.getText();
			String linkhref=Each_link.getAttribute("href");
			
			System.out.println(linkname+"    "+linkhref);
			
			//Click Eachlink
			Each_link.click();
			Thread.sleep(3000);
			
			//Navigate to back page
			driver.navigate().back();
			Thread.sleep(3000);
			
			
			//Restore all identification to avoid staleelementreference exception..
			Footer_Navigation_area=driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
			All_links=Footer_Navigation_area.findElements(By.tagName("a"));
		}
	
		
		
		/*
		 * StateElementReferalException:-->
		 * 		Whenever we are using old referral after page Source changed..
		 */
		
		
		
		
	}

}
