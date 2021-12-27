package com.introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		d.manage().window().maximize();

		// multipleDropdown

		WebElement multi = d.findElement(By.id("multi-select"));
		Select s = new Select(multi);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}

		int size = options.size();
		System.out.println(size);

		// selectByIndex

		for (int i = 0; i < size; i++) {
			if (i == 1 || i == 3 || i == 6 || i == 7 || i == 4) {
				s.selectByIndex(i);

			}
		}

		// getSelectedooption
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text1 = webElement.getText();
			System.out.println(text1);

		}

		// getFirstSelectionoptiom
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text3 = firstSelectedOption.getText();
		System.out.println(text3);

		s.deselectByValue("Florida");

		s.deselectByVisibleText("Pennsylvania");

		s.deselectByIndex(3);

		s.deselectAll();

	}

}
