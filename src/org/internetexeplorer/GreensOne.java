package org.internetexeplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GreensOne {
	
	public static void main(String[] args) {
		
		        // 1. to configure the browser
				System.setProperty("webdriver.ie.driver", "E:\\Selenium Practical\\Day1Task\\Drivers\\IEDriverServer.exe");
				
				// 2. Up Casting
				WebDriver driver = new InternetExplorerDriver();
				
				// 3. To Load the URL
				driver.get("http://www.greenstechnologys.com/");
				
				// 4. To Get the Title in Console
				String title = driver.getTitle();
				System.out.println("Title : " + title);
				
				// 5. To get the Current Url
				String currentUrl = driver.getCurrentUrl();
				System.out.println("Current URL : " + currentUrl);
	}

}
