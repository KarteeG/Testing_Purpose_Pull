package com.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);

		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("Karthick");

		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();

		Thread.sleep(3000);
		WebElement mulitple = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(mulitple);

		Thread.sleep(3000);
		WebElement mu = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
		driver.switchTo().frame(mu);

		WebElement sk = driver.findElement(By.xpath("(//input[@type='text'])"));
		sk.sendKeys("KARTHICK");

		driver.switchTo().defaultContent();
	}

}
