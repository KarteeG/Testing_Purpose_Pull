package com.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Click {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement ca = driver.findElement(By.xpath("//a[text()='Careers']"));
		JavascriptExecutor j =(JavascriptExecutor)driver;
		//j.executeScript("argument[0].scrollIntoview(true);", ca);
		j.executeScript("arguments[0].click();",ca);
	}

}
