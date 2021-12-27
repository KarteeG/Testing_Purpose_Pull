package com.revised;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Action_Click_Double_Context {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);
		WebElement cli = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.click(cli).build().perform();
		driver.navigate().back();
		Thread.sleep(5000);
		
		WebElement con = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		a.contextClick(con).build().perform();
		Thread.sleep(5000);

}
}