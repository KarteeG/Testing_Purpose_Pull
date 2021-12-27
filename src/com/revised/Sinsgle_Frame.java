package com.revised;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sinsgle_Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);

		WebElement enter = driver.findElement(By.xpath("//input[@type='text']"));
		enter.sendKeys("Karthick");

	}
}
