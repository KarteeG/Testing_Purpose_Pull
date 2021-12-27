package com.introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expilicit_Fluent_Wait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		//driver.findElement(By.xpath("//span[text()='For myself']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement cl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='For myself']")));
		cl.click();
		//driver.findElement(By.name("firstName")).sendKeys("Harsh Ajith");
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				
		WebElement fname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		fname.sendKeys("Harsh Ajith");
		driver.findElement(By.name("lastName")).sendKeys("N G");
	}

}


