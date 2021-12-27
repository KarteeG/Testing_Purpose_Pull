package com.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Se_Cl {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.xpath("//span[text()='Create an account']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].click();", gmail);
		Thread.sleep(3000);
		
		j.executeScript("document.getElementById('firstName').setAttribute('value','Ajithkumar')");
		j.executeScript("document.getElementById('lastName').value='Star'");
		j.executeScript("document.getElementById('username').value='Ajithkumar@gmail..com'");
		j.executeScript("document.getElementById('i3').checked=true;");
	}

}
