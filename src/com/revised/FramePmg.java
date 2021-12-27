package com.revised;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePmg {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();

		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		int si = frame.size();
		System.out.println(si);

		driver.switchTo().frame(0);
		WebElement Firstframe = driver.findElement(By.id("Click"));
		Firstframe.click();
		String text = Firstframe.getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement sframe = driver.findElement(By.id("Click1"));
		sframe.click();

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int s = frames.size();
		System.out.println(s);

	}
}