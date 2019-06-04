package capture_screen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_with_TimeStamp {

	public static void main(String[] args) throws IOException 
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
		
		
		//Create simple date formatter
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Get System default time
		Date d=new Date();
		//Convert default data using system date format
		String time=sdf.format(d);
		
		
		
		//Capture screen and take screenshot into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
		

	}

}
