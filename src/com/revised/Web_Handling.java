package com.revised;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web_Handling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(8000);

		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mobiles).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement seller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		a.contextClick(seller).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Ele = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		a.contextClick(Ele).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Fa = driver.findElement(By.xpath("//a[text()='Fashion']"));
		a.contextClick(Fa).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement ccs = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		a.contextClick(ccs).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String parent = driver.getWindowHandle();
		System.out.println("ParentID:" + parent);

		int size = driver.getWindowHandles().size();
		System.out.println(size);

		Set<String> all = driver.getWindowHandles();
		for (String t : all) {
			String title = driver.switchTo().window(t).getTitle();
			System.out.println(title);
			Thread.sleep(5000);

		}
		
		String child = "Amazon.in Help: Help";
		for (String d : all) {
			if (driver.switchTo().window(d).equals(child)){
				break;
			}
			Thread.sleep(5000);
			for (String s1 : all) {
				if (!s1.equals(parent)) {
					driver.switchTo().window(s1);
					driver.close();
				}}}}}

	


