package com.revised;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_cli {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();

		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement create = driver.findElement(By.xpath("//span[text()='Create an account']"));
		j.executeScript("arguments[0].click();", create);

		Thread.sleep(2000);
		j.executeScript("document.getElementById('firstName').setAttribute('value','Ajith')");
		j.executeScript("document.getElementById('lastName').setAttribute('value','Kumar')");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ajithkumar@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		j.executeScript("arguments[0].value='password';", pass);
		WebElement confirm = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		j.executeScript("arguments[0].value='password';", confirm);
		WebElement show = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
		j.executeScript("arguments[0].click();", show);
		WebElement next = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		j.executeScript("arguments[0].click();", next);
		driver.close();

	}
}