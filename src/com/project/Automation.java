package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,800)", "");
		Thread.sleep(3000);

		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement Con = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		a.contextClick(Con).build().perform();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		int size = driver.getWindowHandles().size();
		System.out.println(size);

		Set<String> all = driver.getWindowHandles();
		for (String t : all) {
			String title = driver.switchTo().window(t).getTitle();
			System.out.println(title);
		}

		WebElement add = driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]"));
		a.click(add).build().perform();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();

		Thread.sleep(5000);
		j.executeScript("window.scroll(0,800)", "");
		Thread.sleep(5000);
		WebElement ps = driver
				.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		ps.click();

		Thread.sleep(5000);
		j.executeScript("window.scroll(0,500)", "");
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kartee.sri@gmail.com");
//		driver.findElement(By.id("SubmitCreate")).click();
//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@type='radio']")).click();
//		driver.findElement(By.id("customer_firstname")).sendKeys("Karthick");
//		driver.findElement(By.id("customer_lastname")).sendKeys("G");
//		driver.findElement(By.id("passwd")).sendKeys("password");
//		WebElement day = driver.findElement(By.id("days"));
//		Select s = new Select(day);
//		s.selectByIndex(18);
//		WebElement month = driver.findElement(By.id("months"));
//		Select s1 = new Select(month);
//		s1.selectByIndex(4);
//		WebElement year = driver.findElement(By.id("years"));
//		Select s2 = new Select(year);
//		s2.selectByIndex(4);
//		driver.findElement(By.id("firstname")).sendKeys("Karthick");
//		driver.findElement(By.id("lastname")).sendKeys("G");
//		driver.findElement(By.id("company")).sendKeys("Company");
//		driver.findElement(By.id("address1")).sendKeys("Dindigul");
//		driver.findElement(By.id("address2")).sendKeys("59");
//		driver.findElement(By.id("city")).sendKeys("Dgl");
//		WebElement state = driver.findElement(By.id("id_state"));
//		Select s5 = new Select(state);
//		s5.selectByIndex(5);
//		driver.findElement(By.id("postcode")).sendKeys("00000");
//		WebElement country = driver.findElement(By.id("id_country"));
//		Select s6 = new Select(country);
//		s6.selectByIndex(1);
//		driver.findElement(By.id("other")).sendKeys("Others");
//		driver.findElement(By.id("phone")).sendKeys("000000000");
//		driver.findElement(By.id("phone_mobile")).sendKeys("00000000");
//		driver.findElement(By.id("alias")).sendKeys("Information");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//		driver.quit();

		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("kartee.sri@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();

		Thread.sleep(5000);
		j.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		j.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.id("uniform-cgv")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		j.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		Thread.sleep(5000);
		j.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		j.executeScript("window.scroll(0,400)", "");

	}

}
