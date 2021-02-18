package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practical\\Day1Task\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL : " + currentUrl);
	}

}
