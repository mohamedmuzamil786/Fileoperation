package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {

	public static void main(String[] args) {
		
		// 1. to configure the browser
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practical\\Day1Task\\Drivers\\chromedriver.exe");
				
				// 2. Up Casting
				WebDriver driver = new ChromeDriver();
				
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
