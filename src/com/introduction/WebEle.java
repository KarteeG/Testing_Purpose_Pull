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

public class WebEle {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.facebook.com/");
		d.manage().window().maximize();

		WebElement firstName = d.findElement(By.id("email"));
		firstName.sendKeys("Karthick");

		WebElement lastName = d.findElement(By.name("pass"));
		lastName.sendKeys("12454@sd");
		Thread.sleep(3000);

		WebElement newAcc = d.findElement(By.name("login"));
		newAcc.click();
		Thread.sleep(3000);

		TakesScreenshot t = (TakesScreenshot) d;
		File s = t.getScreenshotAs(OutputType.FILE);
		File de = new File("C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Screen Shots\\snap1.png");
		FileUtils.copyFile(s, de);

	}

}
