package com.revised;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
		d.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = d.getTitle();
		System.out.println(title);
		
		String windowHandle = d.getWindowHandle();
		System.out.println(windowHandle);
		
		Dimension dm=new Dimension(500, 500);
		d.manage().window().setSize(dm);
		
		Point p = new Point(200, 200);
		d.manage().window().setPosition(p);
		
		d.quit();

	}

}
