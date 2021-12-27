package com.introduction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://in.bookmyshow.com/explore/home/dindigul");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Actions
		WebElement cli = driver.findElement(By.id("wzrk-cancel"));
		cli.click();

		Actions a = new Actions(driver);
		WebElement Movies = driver.findElement(By.xpath("//a[@class='sc-RcBXQ fzVlIP']"));
		a.contextClick(Movies).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Stream = driver.findElement(By.xpath("(//a[@class='sc-RcBXQ fzVlIP'])[2]"));
		a.contextClick(Stream).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Event = driver.findElement(By.xpath("(//a[@class='sc-RcBXQ fzVlIP'])[3]"));
		a.contextClick(Event).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Plays = driver.findElement(By.xpath("(//a[@class='sc-RcBXQ fzVlIP'])[4]"));
		a.contextClick(Plays).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// size
		int size = driver.getWindowHandles().size();
		System.out.println("Windows Size = " + size);

		System.out.println("-------------------------------------");

		String parentid = driver.getWindowHandle();
		System.out.println("Parent ID :" + parentid);

		Set<String> all = driver.getWindowHandles();

		// title

		for (String t : all) {
			String title = driver.switchTo().window(t).getTitle();
			System.out.println("Title : " + title);
			Thread.sleep(3000);

		}
		 //specifi the childwindow
		String d = "Watch Movies Online in HD - BookMyShow Stream";

		for (String s : all) {
			if (driver.switchTo().window(s).getTitle().equalsIgnoreCase(d)) {
				break;
			}
			Thread.sleep(3000);
			//close all window except parent window
			for (String s1 : all) {
				if (!s1.equals(parentid)) {
					driver.switchTo().window(s1);
					driver.close();
					
				}
				
			}

		}

	}

}
