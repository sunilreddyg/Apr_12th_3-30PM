package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_ChromeBrowser
{

	public static void main(String[] args)
	{
		
		/*
		 * Download chrome browser driver:--->
		 * 
		 *  URl=L:--> https://www.seleniumhq.org/download/
		 *  	=>  Under third party drivers,bindings and plugins
		 *  		  click google chromedriver  link
		 *  	=>   download chromedriver w.r.t browser version and OS
		 *  	=>   After download unzip the file to project folder
		 *  
		 *  Note:-->
		 *       	Before lauch chome browser set runtime environement
		 *       	property using below syntax.
		 *       
		 *       	System.setProperty("keyname","location of .exe file");
		 */
		
		
		//Set runtime environment variable
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		//load page to empty browser window
		chrome.get("http://seleniumhq.org");
		 
		
	}

}
