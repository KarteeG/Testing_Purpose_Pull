package com.revised;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize();
		
		WebElement cl = d.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		cl.click();

		Thread.sleep(3000);
		WebElement mulitple = d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(mulitple);

		Thread.sleep(3000);
		WebElement mu = d.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
		d.switchTo().frame(mu);

		WebElement sk = d.findElement(By.xpath("(//input[@type='text'])"));
		sk.sendKeys("KARTHICK");

		d.switchTo().defaultContent();
	}
		


}