package com.revised;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Relative_Xpath {
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.linkText("New User Register Here")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Go back to Login page")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Forgot Password?")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Go back to Login page")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("karteeng");
		driver.findElement(By.name("password")).sendKeys("13990T");
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(5000);
		WebElement Location = driver.findElement(By.tagName("select"));
		Select s = new Select(Location);
		s.selectByIndex(6);
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(Hotels);
		s1.selectByValue("Hotel Sunshine");
		WebElement RT = driver.findElement(By.cssSelector("#room_type"));
		Select s2 = new Select(RT);
		s2.selectByVisibleText("Deluxe");
		WebElement NOR = driver.findElement(By.cssSelector("select#room_nos"));
		Select s3 = new Select(NOR);
		s3.selectByIndex(1);
		driver.findElement(By.cssSelector("input.date_pick")).sendKeys("22/10/2021");
		driver.findElement(By.cssSelector("input[name='datepick_out']")).sendKeys("23/10/2021");
		WebElement APR = driver.findElement(By.cssSelector("[name='adult_room']"));
		Select s4 = new Select(APR);
		s4.selectByIndex(2);
		WebElement CPR = driver.findElement(By.cssSelector("[id^='child_room']"));
		Select s5 = new Select(CPR);
		s5.selectByIndex(2);
		driver.findElement(By.cssSelector("[class$='reg_button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[id*='radiobutton_0']")).click();
		driver.findElement(By.cssSelector("input[type='submit'][id='continue']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);", ""	);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("KARTHICK");
		driver.findElement(By.cssSelector("#last_name")).sendKeys("NG");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("ADDRESS");
		driver.findElement(By.cssSelector("#cc_num")).sendKeys("123456789126547896");
		WebElement card = driver.findElement(By.cssSelector("[id='cc_type']"));
		Select s6 = new Select(card);
		s6.selectByIndex(4);
		WebElement SM = driver.findElement(By.cssSelector("select[id='cc_exp_month']"));
		Select s7 = new Select(SM);
		s7.selectByIndex(1);
		WebElement SY = driver.findElement(By.cssSelector("[id^='cc_exp_year']"));
		Select s8 = new Select(SY);
		s8.selectByIndex(12);
		driver.findElement(By.cssSelector("input[id*='cc_cvv']")).sendKeys("000");
		driver.findElement(By.cssSelector("#book_now")).click();
		driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
