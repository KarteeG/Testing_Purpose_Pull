package com.introduction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertySetup {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// get
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		
		driver.manage().window().maximize();
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		//driver.manage().window().wait();
		
		//driver.manage().window().wait(3);

		// maximize
		driver.manage().window().maximize();

		// navigate method

		// to
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		
		String string = driver.navigate().toString();
		System.out.println(string);
		

		// back
		driver.navigate().back();

		// forward
		driver.navigate().forward();

		// refresh
		driver.navigate().refresh();

		// gerCurrentURL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// getTitle
		String title = driver.getTitle();
		System.out.println(title);

		// getPagesource
		 //String pageSource = driver.getPageSource();
		 //System.out.println(pageSource);
		 
		 driver.manage().window().fullscreen();
		 

		// quit
		driver.quit();

	}

}
