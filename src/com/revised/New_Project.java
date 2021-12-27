package com.revised;

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

public class New_Project {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement n = d.findElement(By.id("email"));
		n.sendKeys("Karthick");

		WebElement pas = d.findElement(By.name("pass"));
		pas.sendKeys("123456?");

		WebElement login = d.findElement(By.xpath("//button[@value='1']"));
		login.click();
		Thread.sleep(3000);
		
		d.navigate().back();
		

		WebElement crete = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		crete.click();
		Thread.sleep(3000);

		WebElement fn = d.findElement(By.name("firstname"));
		fn.sendKeys("HarshAjith");
		Thread.sleep(3000);

		WebElement sn = d.findElement(By.name("lastname"));
		sn.sendKeys("Karthick");
		Thread.sleep(3000);

		WebElement mn = d.findElement(By.xpath("(//input[@type='text'])[4]"));
		mn.sendKeys("962548754");
		Thread.sleep(3000);

		WebElement pw = d.findElement(By.xpath("(//input[@type='password'])[2]"));
		pw.sendKeys("4575485");
		Thread.sleep(3000);
		
		WebElement day = d.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("2");
		
		WebElement month = d.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		
		WebElement year = d.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("2000");
		

		WebElement ge = d.findElement(By.xpath("(//input[@type='radio'])[2]"));
		ge.click();
		Thread.sleep(3000);

		WebElement sub = d.findElement(By.xpath("(//button[@type='submit'])[2]"));
		sub.click();
		Thread.sleep(3000);
		
		
		TakesScreenshot ts = (TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Screen Shots\\shot.png");
		FileUtils.copyFile(source, Destination);

	}

}
