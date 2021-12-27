package com.introduction;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PS {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.google.com/");
		Thread.sleep(3000);
		
		d.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		d.manage().window().fullscreen();
		
		d.manage().window().wait(5);
		
		d.manage().window().wait();
		
		
		d.manage().window().maximize();
		

		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = d.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		//to set a size
		
		Dimension size = new Dimension(600, 500);
		Thread.sleep(3000);
		
		d.manage().window().setSize(size);
		Thread.sleep(3000);
		
		Point p = new Point(250, 250);
		d.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		
		d.quit();

	}

}
