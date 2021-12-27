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
import org.openqa.selenium.support.ui.Select;

public class Select_Method {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();

		Thread.sleep(3000);
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("Ajithkumnar");

		WebElement ln = driver.findElement(By.name("lastname"));
		ln.sendKeys("Thala");

		WebElement mn = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mn.sendKeys("58745 58798");

		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("passwird@123");

		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("1");

		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1990");

		WebElement gen = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gen.click();

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Screen Shots\\shot3.png");
		FileUtils.copyFile(source, Destination);

	}

}
