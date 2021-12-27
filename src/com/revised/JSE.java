package com.revised;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/dindigul");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Refersh the Page
		js.executeScript("history.go(0)");
		
		//scroll Down
		js.executeScript("window.scrollBy(0,1500)");
		
		//scroll Up
		js.executeScript("window.scrollBy(0,-500)");
		
		//scroll Starting Position
		js.executeScript("window.scroll(0,0)");
		
		//Simple Alert
		js.executeScript("alert('WELCOME TO BOOKMYSHOW')");
		driver.switchTo().alert().accept();
		
		//Confirm Alert
		js.executeScript("confirm('Please Dismiss The confirm alert')");
		driver.switchTo().alert().dismiss();
		
		//Prompt Alert
		js.executeScript("prompt('Enter your Name')");
		driver.switchTo().alert().sendKeys("Ajith");
		driver.switchTo().alert().accept();
		
		//Navigate To Next Page	
		js.executeScript("window:location='https://www.google.co.in/'");
		Thread.sleep(5000);
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		js.executeScript("arguments[0].click()",gmail);
		Thread.sleep(5000);
		
		WebElement get = driver.findElement(By.xpath("//span[text()='Get Gmail']"));
		js.executeScript("arguments[0].click()",get);
		Thread.sleep(5000);
		
		js.executeScript("document.getElementById('firstName').value='Ajith'");
		js.executeScript("document.getElementById('lastName').value='Thala'");
		js.executeScript("document.getElementById('username').value='Ajith Kumar'");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].value='type@123'",pass);
		
		WebElement con = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		js.executeScript("arguments[0].value='type@123'",con);
		
		js.executeScript("document.getElementById('i3').checked=true");
		Thread.sleep(5000);
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		//js.executeScript("window:location='https://in.bookmyshow.com/explore/home/dindigul'");
		Thread.sleep(10000);
		//scroll Into View
		WebElement cli = driver.findElement(By.xpath("(//div[text()='Maanaadu'])[2]"));
		Thread.sleep(5000);
		cli.click();
		js.executeScript("arguments[0].scrollIntoView();", cli);
		
	}}
