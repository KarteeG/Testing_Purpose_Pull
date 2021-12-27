package com.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elemenets {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Karthick");
		
		WebElement passWord = driver.findElement(By.name("pass"));
		passWord.sendKeys("test@123");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(3000);
		
		
		//driver.quit();
	}

}
