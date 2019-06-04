package capture_screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screen_On_Required_Element {

	public static void main(String[] args) throws IOException, Exception 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		/*
		 * To use fileutils in selenium 3.6 above version below downloads required.
		 * Note:--> Inorder to copy file into local utilities we need to configure
		 * 			below jar files to current project..
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		
		//Using mouse action move to element
		WebElement Submit_btn=driver.findElement(By.id("cjaSubmit"));
		new Actions(driver).moveToElement(Submit_btn).perform();
		Thread.sleep(5000);
		
		
		
		//Capture screen and take screenshot into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\image1.png"));
				

	}

}
