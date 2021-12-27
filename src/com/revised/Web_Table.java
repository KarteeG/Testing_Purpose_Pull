package com.revised;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();

		List<WebElement> Head = driver.findElements(By.tagName("th"));
		int size = Head.size();
		System.out.println("Header Size:  " + size);
		List<WebElement> Row = driver.findElements(By.tagName("tr"));
		int size2 = Row.size();
		System.out.println("Rows Size:   " + size2);
		List<WebElement> col = driver.findElements(By.tagName("td"));
		int size3 = col.size();
		System.out.println("Coloumn size:  " + size3);

		List<WebElement> all_Data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : all_Data) {
			String text = all.getText();
			System.out.println(text);
		}
		System.out.println("------------------------------------------------------------------");
		List<WebElement> particular_Row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement prow : particular_Row) {
			String text = prow.getText();
			System.out.println(text);
		}
		System.out.println("------------------------------------------------------------------");
		List<WebElement> particular_Col = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (WebElement pcol : particular_Col) {
			String text = pcol.getText();
			System.out.println(text);
		}
		System.out.println("------------------------------------------------------------------");
		WebElement partulcar_Data = driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]"));
		String text = partulcar_Data.getText();
		System.out.println(text);

		System.out.println("------------------------------------------------------------------");
		WebElement Specified_Data = driver.findElement(
				By.xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']//following::td[4]"));
		String text2 = Specified_Data.getText();
		System.out.println(text2);
		System.out.println("------------------------------------------------------------------");

		List<WebElement> Small = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		List<Integer> v = new ArrayList<Integer>();
			for (WebElement all : Small) {
				String s = all.getText().replace("%", "");
				v.add(Integer.parseInt(s));
			}
			System.out.println(v);
			Integer min = Collections.min(v);
			System.out.println(min);
			Integer max = Collections.max(v);
			System.out.println(max);
		}

	}

