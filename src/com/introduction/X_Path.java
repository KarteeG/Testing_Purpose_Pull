package com.introduction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement newAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newAcc.click();
		Thread.sleep(3000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Ajith");
		
		WebElement lnmae = driver.findElement(By.name("lastname"));
		lnmae.sendKeys("Kumar");
		
		WebElement me = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		me.sendKeys("9654578456");
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("test@123");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();
		Thread.sleep(3000);
		
		//TakeScreenShot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Screen Shots\\snap.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
	}
}
