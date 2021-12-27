package com.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement cl = driver.findElement(By.xpath("(//button[@class])[2]"));
		//click
		js.executeScript("arguments[0].click()", cl);
		
		//refresh the Page
		js.executeScript("history.go(0)");
		
		
		//scroll Down
		js.executeScript("window.scrollBy(0,1500)");
		
		//scroll Up
		js.executeScript("window.scrollBy(0,-1000)");
		
		//scroll Starting Positions
		js.executeScript("window.scroll(0,0)");
		
		//Simple Alert
		js.executeScript("alert('welcome')");
		driver.switchTo().alert().accept();
		
		//confirm Alert
		js.executeScript("confirm('Are You Sure')");
		driver.switchTo().alert().dismiss();
		
		//prompt Alert
		js.executeScript("prompt('Enter Your Name')");
		driver.switchTo().alert().sendKeys("Harsh Ajith");
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//Navigate To Next Page
		js.executeScript("window:location='https://www.google.com/intl/en-GB/gmail/about/#'");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[text()='Create an account'])[2]")).click();
		Thread.sleep(5000);
		
		//checkBoc Tick Or Not
		js.executeScript("document.getElementById('i3').checked=true");
		Thread.sleep(5000);
		js.executeScript("document.getElementById('i3').checked=false");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		
		//scrollInToView
		Thread.sleep(5000);
		WebElement shipping= driver.findElement(By.xpath("//a[text()='Shipping']"));
		shipping.click();
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", shipping);
		Thread.sleep(5000);
		driver.navigate().back();
		
}
}