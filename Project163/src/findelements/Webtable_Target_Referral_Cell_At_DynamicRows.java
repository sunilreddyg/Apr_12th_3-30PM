package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Target_Referral_Cell_At_DynamicRows 
{

	public static void main(String[] args)
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify markets link
		WebElement Markets_link=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets_link.click();
		
		
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Find list of Rows under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("List of rows available under table => "+rows.size());
		
		//Iterate for number of rows in table
		for (int i = 1; i < rows.size(); i++) 
		{
			//Target Each dynamic row
			WebElement DynamicRow=rows.get(i);
			
			//Capture DynamicRow Text
			String RowText=DynamicRow.getText();
			
			if(RowText.contains("BAAUTO"))
			{
				System.out.println("Record exist at => "+i+" Row");
				//Identify List of Cells under Each dynamic row
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				cells.get(7).findElement(By.tagName("a")).click();
				break;  //stop iteration
			
				
			}
			
				
		}//for
		
		
		


	}

}
