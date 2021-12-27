package com.introduction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);

		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);

		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);

		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);

		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);

		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);

		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);

		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}}


