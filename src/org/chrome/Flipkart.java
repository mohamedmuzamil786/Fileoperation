package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practical\\Day1Task\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL : " + currentUrl);
	}

}
