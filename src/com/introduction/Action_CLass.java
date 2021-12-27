package com.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_CLass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		Actions a = new Actions(driver);
		
		WebElement from_element = driver.findElement(By.id("draggable"));
		
		WebElement to_element = driver.findElement(By.id("droppable"));
		a.dragAndDrop(from_element, to_element).build().perform();
		
		

	}

}
