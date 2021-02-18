package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
	
	public static void main(String[] args) {
		        // 1. to configure the browser
				System.setProperty("webdriver.gecko.driver", "E:\\Selenium Practical\\Day1Task\\Drivers\\geckodriver.exe");
				
				// 2. Up Casting
				WebDriver driver = new FirefoxDriver();
				
				// 3. To Load the URL
				driver.get("http://gmail.com/");
				
				// 4. To Get the Title in Console
				String title = driver.getTitle();
				System.out.println("Title : " + title);
				
				// 5. To get the Current Url
				String currentUrl = driver.getCurrentUrl();
				System.out.println("Current URL : " + currentUrl);
	}

}
