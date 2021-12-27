package com.revised;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		WebElement first = driver.findElement(By.id("dropdown1"));
		Select s = new Select(first);
		s.selectByIndex(2);

		WebElement second = driver.findElement(By.name("dropdown2"));
		Select s1 = new Select(second);
		s1.selectByVisibleText("Selenium");

		WebElement third = driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(third);
		s2.selectByValue("3");

		WebElement get = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s3 = new Select(get);
		s3.selectByIndex(2);
		int size = s3.getOptions().size();
		System.out.println(size);
		
		
		
	}
}
