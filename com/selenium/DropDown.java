package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";
		Driver.get(url);
		Driver.manage().window().maximize();
		WebElement Dropdown = Driver.findElement(By.xpath("//select[@name='dropdown']"));
		Select S = new Select (Dropdown);
		S.selectByValue("ddselenium");
		Thread.sleep(3000);
		S.selectByVisibleText("Manual Testing");
		List<WebElement> Allselect = S.getOptions();
		for(WebElement Y:Allselect) {
			String SELALL = Y.getText();
			System.out.println(SELALL);
		}
		//Multiple dropdown
		WebElement Dropdown2 = Driver.findElement(By.xpath("(//select[@class='spTextField'])[1]"));
		Select SS = new Select(Dropdown2);
		boolean equals = SS.isMultiple();
		System.out.println(equals);
		SS.selectByIndex(0);
		SS.selectByValue("msagile");
		SS.selectByVisibleText("Manual Testing");
		List<WebElement> Selopt = SS.getAllSelectedOptions();
		for(WebElement Z:Selopt) {
			String Selectopt = Z.getText();
			System.out.println(Selectopt);
		}
		Thread.sleep(3000);
		SS.deselectAll();
				
	}
	}
	

