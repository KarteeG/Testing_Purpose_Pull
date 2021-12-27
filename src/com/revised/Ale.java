package com.revised;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ale {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		
		WebElement single = d.findElement(By.xpath("//button[@class='btn btn-danger']"));
		single.click();
		
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement confirm = d.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		
		WebElement cl = d.findElement(By.xpath("//button[@class='btn btn-primary']"));
		cl.click();
		d.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		
		WebElement pro = d.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		pro.click();
		
		WebElement fe = d.findElement(By.xpath("//button[@class='btn btn-info']"));
		fe.click();
		Thread.sleep(2000);
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().sendKeys("Ajith");
		d.switchTo().alert().accept();
		
	}
}
