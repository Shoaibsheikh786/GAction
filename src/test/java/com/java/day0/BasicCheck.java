package com.java.day0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicCheck {
	
	@Test
	public void method1(){
		
		System.out.println("######Hello world this is simple code#######");
	}
	
	@Test
	public void test2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.close();
	}

}
