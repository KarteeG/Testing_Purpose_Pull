package com.introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();

		// simple
		WebElement sim = d.findElement(By.xpath("//button[@class='btn btn-danger']"));
		sim.click();
		d.switchTo().alert().accept();

		// confirm
		WebElement confirm = d.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();

		WebElement c = d.findElement(By.xpath("//button[@class='btn btn-primary']"));
		c.click();

		d.switchTo().alert().dismiss();

		// prompt
		WebElement prompt = d.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();

		WebElement p = d.findElement(By.xpath("//button[@class='btn btn-info']"));
		p.click();

		d.switchTo().alert().sendKeys("KARTHICK");
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();

		Thread.sleep(3000);
		WebElement g = d.findElement(By.id("demo1"));
		String text = g.getText();
		System.out.println(text);

		d.quit();

	}

}
