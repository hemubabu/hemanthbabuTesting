package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://chercher.tech/practice/frames-example-selenium-webdriver";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.switchTo().frame("frame2");
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Select S = new Select(animals);
		S.selectByVisibleText("Avatar");
//		WebElement topic = driver.findElement(By.xpath("//b[@id='topic']"));
//		topic.sendKeys("babu");
	}

}
