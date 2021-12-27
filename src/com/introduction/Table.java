package com.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		System.out.println("-----------------------------------------------");
		// AllData
		List<WebElement> all = driver.findElements(By.xpath("//table//tbody/tr/td"));
		for (WebElement alldata : all) {
			System.out.println(alldata.getText());
		}
		// ParticularRow
		System.out.println("-----------------------------------------------");
		List<WebElement> Row = driver.findElements(By.xpath("//table//tbody/tr[3]/td"));
		for (WebElement PR : Row) {
			System.out.println(PR.getText());
		}
		// ParticularColoumn
		System.out.println("-----------------------------------------------");
		List<WebElement> Col = driver.findElements(By.xpath("//table//tbody/tr/td[2]"));
		for (WebElement PC : Col) {
			System.out.println(PC.getText());
		}
		System.out.println("-----------------------------------------------");
		// ParticularData
		WebElement data = driver.findElement(By.xpath("//table//tbody/tr[5]/td[5]"));
		System.out.println(data.getText());
		System.out.println("-----------------------------------------------");

		List<WebElement> header = driver.findElements(By.tagName("th"));
		int size = header.size();
		System.out.println("Header Sie:" + size);

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int size2 = rows.size();
		System.out.println("Rowsize:" + size2);

		List<WebElement> co = driver.findElements(By.tagName("td"));
		int size3 = co.size();
		System.out.println("Coloumn Size" + size3);

		WebElement follow = driver.findElement(By.xpath("//td[normalize-space()='Learn Locators']//following::td[4]"));
		System.out.println(follow.getText());
		System.out.println("-----------------------------------------------");
		// Smallest
		List<WebElement> ParCol = driver.findElements(By.xpath("//table//tbody/tr/td[2]"));
		List<Integer> n = new ArrayList<Integer>();
		for (WebElement g : ParCol) {
			String v = g.getText().replace("%", "");
			n.add(Integer.parseInt(v));
		}
		System.out.println("List Of Numbers  "+ n);
		Integer min = Collections.min(n);
		System.out.println("Minimum Numer:  "+min);
		System.out.println("-----------------------------------------------");
		
	
		}
			
	}
			
			
			
			


