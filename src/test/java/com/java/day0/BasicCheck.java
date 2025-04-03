package com.java.day0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BasicCheck {
	
 @Test
 public void demo()
 {
	 System.out.println("Hello world ##########This is jaa ");
 }
	
	@Test
	public void test2()
	{
		boolean isHeadless =Boolean.parseBoolean(System.getProperty("headless", "false"));
		ChromeOptions options = new ChromeOptions();
		if (isHeadless) {
		    options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
		}
  System.out.println(isHeadless);
	        // Initialize WebDriver with options
	        WebDriver driver = new ChromeDriver(options);

	        // Open Facebook
	        driver.get("https://www.facebook.com");

	        // Print the title (for debugging)
	        System.out.println("Page Title: " + driver.getTitle());

	        // Close browser
	        driver.quit();
	}

}
