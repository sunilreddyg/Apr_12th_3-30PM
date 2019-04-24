package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_ie_browser
{

	public static void main(String[] args)
	{
		
		/*
		 * download  IEDriverServer.exe file
		 * 		URL:--> https://www.seleniumhq.org/download/
		 * 		download IEdriverserver under the internet explorer driver server.
		 * 
		 * 		Security setting for IE-browser:-->
		 * 			
		 * 			=>  IE browser zoom level should be 100%
		 * 			=>  Go to internet options and disable all security and private 
		 * 						settings
		 * 
		 */
	
		//Setup runtime environment variable
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		//launch browser window
		InternetExplorerDriver ie=new InternetExplorerDriver();
		//load webpage to empty browser window
		ie.get("http://seleniumhq.org");

	}

}
