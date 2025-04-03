package com.java.day0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BasicCheck {
	
	@Test
	public void method1(){
		
		System.out.println("######Hello world this is simple code#######");
	}
	
	@Test
	public void test2()
	{
		  ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");  // Run Chrome in headless mode (important for GitHub Actions)
	        options.addArguments("--no-sandbox"); // Bypass OS security model
	        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resources issues

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
