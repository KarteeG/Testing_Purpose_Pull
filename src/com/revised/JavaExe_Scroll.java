package com.revised;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExe_Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(8000);

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,3000)", "");
		Thread.sleep(8000);

		j.executeAsyncScript("window.scroll(0,-3000)", "");

	}
}