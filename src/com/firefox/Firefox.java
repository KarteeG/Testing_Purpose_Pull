package com.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Google Chrome\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}

}
