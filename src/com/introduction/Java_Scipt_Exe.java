package com.introduction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Scipt_Exe {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://in.bookmyshow.com/explore/home/dindigul");
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.id("wzrk-cancel"));
		cancel.click();

		JavascriptExecutor f = (JavascriptExecutor) driver; // narrowing Casting
		f.executeScript("window.scroll(0,600)", "");
		Thread.sleep(5000);
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Screen Shots\\scrolldown.png");
		FileUtils.copyFile(source, Destination);

		f.executeScript("window.scroll(0,-600)", "");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File so = ts.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Screen Shots\\scrollup.png");
		FileUtils.copyFile(so, Des);

	}

}
