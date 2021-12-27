package com.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactlin {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("karteeng");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("13990T");
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement Location= driver.findElement(By.id("location"));
		Thread.sleep(2000);
		Select s=new Select(Location);
		s.selectByIndex(1);
		Thread.sleep(2000);
		WebElement Hotels= driver.findElement(By.id("hotels"));
		Select s1=new Select(Hotels);
		s1.selectByValue("Hotel Sunshine");
		Thread.sleep(2000);
		WebElement Room= driver.findElement(By.id("room_type"));
		Select s2=new Select(Room);
		s2.selectByVisibleText("Deluxe");
		Thread.sleep(2000);
		WebElement nor= driver.findElement(By.id("room_nos"));
		Select s3=new Select(nor);
		s3.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.id("datepick_in")).sendKeys("20/10/2021");
		Thread.sleep(2000);
		driver.findElement(By.id("datepick_out")).sendKeys("21/10/2021");
		Thread.sleep(2000);
		WebElement childroom= driver.findElement(By.id("child_room"));
		Select s5=new Select(childroom);
		s5.selectByIndex(2);
		Thread.sleep(2000);
		WebElement adult= driver.findElement(By.id("adult_room"));
		Select s4=new Select(adult);
		s4.selectByIndex(3);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("radiobutton_0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("first_name")).sendKeys("Karthick");
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys("G");
		Thread.sleep(2000);
		driver.findElement(By.id("address")).sendKeys("Address");
		Thread.sleep(2000);
		driver.findElement(By.id("cc_num")).sendKeys("5985498786545154");
		Thread.sleep(2000);
		WebElement type = driver.findElement(By.id("cc_type"));
		Thread.sleep(2000);
		Select s6 = new Select(type);
		s6.selectByIndex(1);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(month);
		s7.selectByIndex(1);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByIndex(10);
		Thread.sleep(2000);
		driver.findElement(By.id("cc_cvv")).sendKeys("000");
		Thread.sleep(2000);
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,800)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("my_itinerary")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("order_id_text")).sendKeys("DG5B6I0M77");
		Thread.sleep(2000);
		driver.findElement(By.id("search_hotel_id")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logout")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
