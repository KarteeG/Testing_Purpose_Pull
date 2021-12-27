package com.introduction;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitl_Wait_Method {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("0HarshAjith");
		driver.findElement(By.id("pass")).sendKeys("000");
		driver.findElement(By.name("login")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Karthick");
		driver.findElement(By.name("lastname")).sendKeys("N.G.");
		
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//span[text()='For myself']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Harsh Ajith");
		driver.findElement(By.name("lastName")).sendKeys("N G");
		
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("000000000");
	}
}
